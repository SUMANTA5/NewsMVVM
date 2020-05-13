package com.sumanta.newsmvvm.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.sumanta.newsmvvm.R
import com.sumanta.newsmvvm.ui.NewsActivity
import com.sumanta.newsmvvm.ui.NewsViewModel

class SearchNewsFragment: Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel  = (activity as NewsActivity).viewModel
    }


}