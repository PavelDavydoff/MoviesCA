package com.example.moviesca.data

import com.example.moviesca.data.dto.Response

interface NetworkClient {
    fun doRequest(dto: Any): Response
}