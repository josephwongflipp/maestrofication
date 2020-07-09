package com.josephwong.maestrofication.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitProvider @Inject constructor() {
    private fun getRetrofit(baseUrl: String, secondsToTimeOut: Long = 30L): Retrofit {

        val okHttpClient: OkHttpClient = OkHttpClient.Builder()
            .readTimeout(secondsToTimeOut, TimeUnit.SECONDS)
            .connectTimeout(secondsToTimeOut, TimeUnit.SECONDS)
            .build()

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        return retrofitBuilder
    }

    // https://holodeck.flippback.com/maestro/v3/brand-media/api/
    fun getMaestroService(baseUrl: String = "https://cdn-gateflipp.flippback.com/maestro/"): IMaestroRetrofitService {
        val retrofit = getRetrofit(baseUrl)
        return retrofit.create(IMaestroRetrofitService::class.java)
    }
}
