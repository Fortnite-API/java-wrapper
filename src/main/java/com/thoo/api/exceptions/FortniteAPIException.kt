package com.thoo.api.exceptions

class FortniteAPIException(status: Int, error: String) : Exception("FortniteAPI Error: $error Code: $status")