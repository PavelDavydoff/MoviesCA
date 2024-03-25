package com.example.moviesca.data.dto

import com.example.moviesca.domain.models.Movie

class MoviesSearchResponse(val searchType: String,
                           val expression: String,
                           val results: List<MovieDto>) : Response()