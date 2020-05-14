package com.sumanta.newsmvvm.ui.fragment

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.sumanta.newsmvvm.R
import com.sumanta.newsmvvm.ui.NewsActivity
import com.sumanta.newsmvvm.ui.NewsViewModel
import kotlinx.android.synthetic.main.fragment_article.*
import kotlinx.android.synthetic.main.item_article_preview.*

class ArticleFragment: Fragment(R.layout.fragment_article) {

    lateinit var viewModel: ViewModel
    val args: ArticleFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel  = (activity as NewsActivity).viewModel

        val article = args.article
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }


        fab.setOnClickListener {
            (viewModel as NewsViewModel).saveArticle(article)
            Snackbar.make(view,"Article saved successfully", Snackbar.LENGTH_SHORT).show()

        }


    }

}