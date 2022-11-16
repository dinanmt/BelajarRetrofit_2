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
    @GET("top-headlines?country=us&apiKey=2a78c5b43e5847ac8f95fc1d5fa310d1")
    suspend fun getEverything(): NewsData

}

object Api {
    val newsApiService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}