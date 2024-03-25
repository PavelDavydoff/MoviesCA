package com.example.moviesca.domain.api

import com.example.moviesca.domain.models.Movie
import com.example.moviesca.util.Resource

interface MoviesRepository {
    fun searchMovies(expression: String): Resource<List<Movie>>
}