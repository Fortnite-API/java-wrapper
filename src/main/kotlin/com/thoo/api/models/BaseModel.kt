package com.thoo.api.models

data class BaseModel<T>(
        val code: Int,
        val data: T
)