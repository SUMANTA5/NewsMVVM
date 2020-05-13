package com.sumanta.newsmvvm.ui

import androidx.lifecycle.ViewModel
import com.sumanta.newsmvvm.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}