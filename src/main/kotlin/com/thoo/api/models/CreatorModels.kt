package com.thoo.api.models

data class Creator(
        val code: String,
        val account: CreatorAccount,
        val status: String,
        val verified: Boolean
)

data class CreatorAccount(
        val id: String,
        val name: String
)