package com.example.moviesca.presentation.movies

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.moviesca.R
import com.example.moviesca.util.Creator

class PosterActivity : AppCompatActivity(), PosterView {

    private lateinit var posterPresenter : PosterPresenter

    private lateinit var poster: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val url = intent.extras?.getString("poster", "") ?: ""
        posterPresenter = Creator.providePosterPresenter(this, url)
        setContentView(R.layout.activity_poster)
        poster = findViewById(R.id.poster)
        posterPresenter.onCreate()
    }

    override fun showPoster(url: String) {
        Glide.with(applicationContext)
            .load(url)
            .into(poster)
    }
}