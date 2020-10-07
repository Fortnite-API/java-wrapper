package com.thoo.api.models

import com.google.gson.annotations.SerializedName

data class AesModel(
        val build: String,
        val mainKey: String,
        val dynamicKeys: List<DynamicKey>
)

data class DynamicKey(
        @SerializedName("pakFilename")
        val pakFileName: String,
        val pakGuid: String,
        val key: String
)