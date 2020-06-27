package com.thoo.api.models

import java.util.*

class AESModel(
        val build: String,
        val mainKey: String,
        val dynamicKeys: Array<DynamicPak>,
        val updated: Date
)

class DynamicPak(
        val pakFilename: String,
        val pakGuid: String,
        val key: String
)