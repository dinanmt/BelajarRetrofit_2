package com.example.retrofit_2.model

data class NewsData(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int

)