package com.thoo.api.model;

public enum AccountType {

    PC("epic"),
    PSN("psn"),
    XBOX("xb1");

    public String code;

    AccountType(String code) {
        this.code = code;
    }

}
