package com.example.moviesca

import android.app.Application
import com.example.moviesca.presentation.movies.MoviesSearchViewModel

class MoviesApplication: Application() {
    var moviesSearchPresenter : MoviesSearchViewModel? = null
}