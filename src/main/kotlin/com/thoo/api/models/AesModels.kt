package com.thoo.api.models

import com.google.gson.annotations.SerializedName

class AesModel(
        val build: String,
        val mainKey: String,
        val dynamicKeys: List<DynamicKey>
)

class DynamicKey(
        @SerializedName("pakFilename")
        val pakFileName: String,
        val pakGuid: String,
        val key: String
)