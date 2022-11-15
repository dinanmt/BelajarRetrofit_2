package com.example.retrofit_2.network

import com.example.retrofit_2.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
//    @GET("everything?q=tesla&from=2022-10-15&sortBy=publishedAt&apiKey=9da2ec6a15634ea09aab3cc7868c552e")
    @GET("everything?q=tesla&from=2022-10-15&sortBy=publishedAt&apiKey=8545a8cb50b4454c8dd2c195e892e94a")
    suspend fun getEverything(): NewsData

}

object Api {
    val newsApiService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}