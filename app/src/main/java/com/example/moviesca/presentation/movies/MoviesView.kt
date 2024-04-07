package com.example.moviesca.presentation.movies

import com.example.moviesca.domain.models.Movie
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MoviesView: MvpView {
    // Методы, меняющие внешний вид экрана

    // Состояние «загрузки»
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun render(state: MoviesState)

    fun showLoading()

    // Состояние «ошибки»
    fun showError(errorMessage: String)

    // Состояние «пустого списка»
    fun showEmpty(emptyMessage: String)

    // Состояние «контента»
    fun showContent(movies: List<Movie>)
    @StateStrategyType(OneExecutionStateStrategy::class)
    fun showToast(additionalMessage: String)
}