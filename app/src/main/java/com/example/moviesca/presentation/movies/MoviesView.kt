package com.example.moviesca.presentation.movies

import com.example.moviesca.domain.models.Movie

interface MoviesView {
    // Методы, меняющие внешний вид экрана

    // Состояние «загрузки»
    fun render(state: MoviesState)

    fun showLoading()

    // Состояние «ошибки»
    fun showError(errorMessage: String)

    // Состояние «пустого списка»
    fun showEmpty(emptyMessage: String)

    // Состояние «контента»
    fun showContent(movies: List<Movie>)

    fun showToast(additionalMessage: String)
}