package com.josephwong.maestrofication.repositories

import android.util.Log
import com.josephwong.maestrofication.models.Flyer
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.network.RetrofitProvider
import com.josephwong.maestrofication.network.maestro.MaestroRequestBody
import com.josephwong.maestrofication.services.maestro.MaestroParser
import com.josephwong.maestrofication.utils.AvroUtil
import kotlinx.coroutines.delay
import maestro.response.MaestroResponse
import java.io.InputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MaestroRepository @Inject constructor(private val retrofitProvider: RetrofitProvider) {
    private val TAG: String = MaestroRepository::class.java.simpleName

    private val maestroCache: HashMap<String, MaestroResponse> = HashMap()

    /**
     * Executes the network request to get a MaestroResponse.
     *
     * This will also truncate our current DB of flyers and save current flyers into the DB.
     */
    suspend fun fetchCleanMaestroResponse(category: String? = "explore"): MaestroResponseWrapper? {

        // Check cache first
        if (maestroCache[category ?: "explore"] != null) {
            return MaestroParser().parseMaestroResponse(maestroCache[category ?: "explore"]!!)
        }

        val call = retrofitProvider.getMaestroService()
            .getBrowseAvroEncodedObject(buildMaestroResponseBody(category))
        val response = call.execute()
        val responseBody = response.body()

        if (!response.isSuccessful || responseBody == null) {
            Log.e(TAG, "Unable to get response from : $response")
            return null
        }

        val inputStream: InputStream = responseBody.byteStream()
        inputStream.close()

        delay(4000L)

        try {
            val maestroResponse =
                AvroUtil().decodeFromInputStream(MaestroResponse.`SCHEMA$`, inputStream)
            if (maestroResponse is MaestroResponse) {
                maestroCache[category ?: "explore"] = maestroResponse
//                favFlyers = FlyerRepo.getFavFlyers
//                readFlyers = FlyerRepo.getR
//
//                return (maestroResponse, favFlyers, readFlyers)
                return MaestroParser().parseMaestroResponse(maestroResponse)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error: Unable to retrieve Config from app-config: $e")
            return null
        }

        return null
    }

    private fun buildMaestroResponseBody(category: String? = "explore"): MaestroRequestBody {
        return MaestroRequestBody(
            "9.28-46-ge63553864",
            "ca",
            "9.28-46-ge63553864",
            "en_US",
            "Android",
            "M5R1M2",
            "362b1a84-46bc-4180-8160-c1e6cf97c9f6",
            "47796955-8f0e-488a-a456-271c6ceaa65c",
            2448,
            "7.0",
            category
        )
    }
}
