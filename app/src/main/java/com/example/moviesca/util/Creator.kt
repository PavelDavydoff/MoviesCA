package com.example.moviesca.util

import android.content.Context
import com.example.moviesca.data.MoviesRepositoryImpl
import com.example.moviesca.data.network.RetrofitNetworkClient
import com.example.moviesca.domain.api.MoviesInteractor
import com.example.moviesca.domain.api.MoviesRepository
import com.example.moviesca.domain.impl.MoviesInteractorImpl
import com.example.moviesca.presentation.movies.MoviesSearchViewModel
import com.example.moviesca.presentation.movies.PosterPresenter
import com.example.moviesca.presentation.movies.PosterView

object Creator {
    private fun getMoviesRepository(context: Context): MoviesRepository {
        return MoviesRepositoryImpl(RetrofitNetworkClient(context))
    }

    fun provideMoviesInteractor(context: Context): MoviesInteractor {
        return MoviesInteractorImpl(getMoviesRepository(context))
    }

    fun providePosterPresenter(view: PosterView, url: String): PosterPresenter {
        return PosterPresenter(view, url)
    }
}