package com.josephwong.maestrofication.network

import com.josephwong.maestrofication.network.maestro.MaestroRequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface IMaestroRetrofitService {

    @POST("browse")
    @Headers(
        "Content-Type: application/json",
        "cache-control: no-cache"
    )
    fun getBrowseAvroEncodedObject(
        @Body body: MaestroRequestBody
    ): Call<ResponseBody>

}
