package com.example.android.newsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.android.newsapp.R
import com.example.android.newsapp.database.ArticleDatabase
import com.example.android.newsapp.repository.NewsRepository

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelFactory = NewsViewModelFactory(newsRepository)

        viewModel = ViewModelProvider(this, viewModelFactory).get(NewsViewModel::class.java)

//        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())

    }
}

