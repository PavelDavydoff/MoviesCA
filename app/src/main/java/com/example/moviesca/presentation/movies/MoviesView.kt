package com.example.moviesca.presentation.movies

import android.content.Context
import com.example.moviesca.domain.models.Movie

interface MoviesView {
    fun showPlaceholderMessage(isVisible: Boolean)

    fun showMoviesList(isVisible: Boolean)

    fun showProgressBar(isVisible: Boolean)

    fun changePlaceholderText(newPlaceholderText: String)

    fun updateMoviesList(newMoviesList: List<Movie>)

    fun showToast(text: String)
}