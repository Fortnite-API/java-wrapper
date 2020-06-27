package com.thoo.api.models

class CreatorCode(
        val code: String,
        val account: CreatorAccount,
        val status: String,
        val verified: Boolean
)

class CreatorAccount(
        val id: String,
        val name: String
)