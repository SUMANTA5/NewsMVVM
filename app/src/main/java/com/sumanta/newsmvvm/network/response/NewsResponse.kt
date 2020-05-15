package com.sumanta.newsmvvm.network.response

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)