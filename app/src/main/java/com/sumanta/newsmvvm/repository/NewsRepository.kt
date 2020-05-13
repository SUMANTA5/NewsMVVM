package com.sumanta.newsmvvm.repository

import com.sumanta.newsmvvm.db.ArticleDatabase
import com.sumanta.newsmvvm.network.api.RetrofitInstance

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, PageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, PageNumber)
}