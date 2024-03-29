package com.example.moviesca.util

import android.app.Activity
import android.content.Context
import com.example.moviesca.data.MoviesRepositoryImpl
import com.example.moviesca.data.network.RetrofitNetworkClient
import com.example.moviesca.domain.api.MoviesInteractor
import com.example.moviesca.domain.api.MoviesRepository
import com.example.moviesca.domain.impl.MoviesInteractorImpl
import com.example.moviesca.presentation.movies.MoviesSearchPresenter
import com.example.moviesca.presentation.movies.PosterPresenter
import com.example.moviesca.presentation.movies.MoviesView
import com.example.moviesca.presentation.movies.PosterView

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun provideMoviesSearchPresenter(
        moviesView: MoviesView,
        context: Context
    ): MoviesSearchPresenter {
        return MoviesSearchPresenter(
            view = moviesView,
            context = context
        )
    }

    fun providePosterPresenter(view: PosterView, url: String): PosterPresenter {
        return PosterPresenter(view, url)
    }
}