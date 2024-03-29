package com.example.moviesca.presentation.movies

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.moviesca.R

class PosterPresenter(private val view: PosterView, private val url: String) {

    fun onCreate() {
        view.showPoster(url)
    }
}