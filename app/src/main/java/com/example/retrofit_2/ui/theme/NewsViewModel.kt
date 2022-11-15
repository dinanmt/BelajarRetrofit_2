package com.example.retrofit_2.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit_2.model.Article
import com.example.retrofit_2.network.Api
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {

    init {
        getListNews()
    }

    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsApiService.getEverything()
            val articles = response.articles

            articles.forEach { article: Article ->
                Log.d("respon","kenapa gagalll")
                Log.d("response", article.toString())
            }
        }
    }
}