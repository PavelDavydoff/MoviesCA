package com.example.moviesca.domain.api

import com.example.moviesca.domain.models.Movie

interface MoviesInteractor{
    fun searchMovies(expression: String, consumer: MoviesConsumer)

    interface MoviesConsumer {
        fun consume(foundMovies: List<Movie>?, errorMessage: String?)
    }
}