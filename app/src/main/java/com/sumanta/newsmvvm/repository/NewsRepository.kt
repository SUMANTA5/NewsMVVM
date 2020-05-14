package com.sumanta.newsmvvm.repository

import com.sumanta.newsmvvm.db.ArticleDatabase
import com.sumanta.newsmvvm.network.api.RetrofitInstance
import com.sumanta.newsmvvm.network.response.Article

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, PageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, PageNumber)


    suspend fun searchNews(searchQuery: String, PageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, PageNumber)


    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticle()


    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)

}