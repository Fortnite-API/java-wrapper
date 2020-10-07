package com.thoo.api.exceptions

class FortniteApiException(
    message: String?
): Exception(message ?: "Unknown.")