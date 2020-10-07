package com.thoo.api.retro

import java.io.IOException

sealed class ApiResponse<T: Any> {

    data class Success<T: Any>(
            val data: Any?,
            val status: Int
    ): ApiResponse<T>()

    data class ApiError(
            val error: String,
            val status: Int
    ): ApiResponse<Nothing>()

    data class NetworkError(
            val error: IOException
    ): ApiResponse<Nothing>()

    data class Error(
            val error: Throwable
    ): ApiResponse<Nothing>()

}