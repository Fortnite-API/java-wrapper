package com.thoo.api.enums

enum class MatchMethod(val code: String) {

    FULL("full"),
    CONTAINS("contains"),
    STARTS("starts"),
    ENDS("ends");

    override fun toString(): String = code

}