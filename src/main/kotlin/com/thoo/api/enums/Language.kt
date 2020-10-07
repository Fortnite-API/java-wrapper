package com.thoo.api.enums

@Suppress("unused")
enum class Language(
    val code: String
) {

    AR("ar"),
    DE("de"),
    EN("en"),
    ES("es"),
    `ES-419`("es-419"),
    FR("fr"),
    IT("it"),
    JA("ja"),
    KO("ko"),
    PL("pl"),
    `PT-BR`("pt-BR"),
    RU("ru"),
    TR("tr"),
    `ZH-CN`("zh-CN"),
    `ZH-HANT`("zh-Hant");

    companion object {

        @JvmStatic fun getES419() = getLanguageByName("ES-419")
        @JvmStatic fun getPTBR() = getLanguageByName("PT-BR")
        @JvmStatic fun getCN() = getLanguageByName("ZH-CN")
        @JvmStatic fun getZHHANT() = getLanguageByName("ZH-HANT")

        @JvmStatic
        fun getLanguageByName(name: String): Language {
            return valueOf(name.toUpperCase())
        }

    }

}