package com.thoo.api.enums;

public enum ImageType {

    ALL("all"),
    KEYBOARD_MOUSE("keyboardMouse"),
    GAMEPAD("gamepad"),
    TOUCH("touch"),
    NONE("none");

    public String code;

    ImageType(String code){
        this.code = code;
    }

}
