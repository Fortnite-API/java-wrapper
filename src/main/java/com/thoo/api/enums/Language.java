package com.thoo.api.enums;

public enum Language {

    AR("ar"),
    DE("de"),
    EN("en"),
    ES419("es-419"),
    ES("es"),
    FR("fr"),
    IT("it"),
    JA("ja"),
    KO("ko"),
    PL("pl"),
    PTBR("pt-BR"),
    RU("ru"),
    TR("tr"),
    ZHCN("zh-CN"),
    ZHHANT("zh-Hant");

    public String code;

    Language(String code){
        this.code = code;
    }

}
