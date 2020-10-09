package com.thoo.api.exceptions

class FortniteApiException(
        status: Int,
        error: String
): Exception("$error (${status})")