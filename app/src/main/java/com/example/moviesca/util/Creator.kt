package com.example.moviesca.util

import android.app.Activity
import android.content.Context
import com.example.moviesca.data.MoviesRepositoryImpl
import com.example.moviesca.data.network.RetrofitNetworkClient
import com.example.moviesca.domain.api.MoviesInteractor
import com.example.moviesca.domain.api.MoviesRepository
import com.example.moviesca.domain.impl.MoviesInteractorImpl
import com.example.moviesca.presentation.MoviesSearchController
import com.example.moviesca.presentation.PosterController
import com.example.moviesca.ui.movies.MoviesAdapter

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchController(activity: Activity, adapter: MoviesAdapter): MoviesSearchController {
        return MoviesSearchController(activity, adapter)
    }

    fun providePosterController(activity: Activity): PosterController {
        return PosterController(activity)
    }
}