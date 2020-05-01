package com.thoo.api.exceptions;

import com.google.gson.Gson;
import com.thoo.api.model.ExceptionModel;
import okhttp3.ResponseBody;

public final class FortniteException extends Exception {

    private int code;
    private String error;

    public FortniteException(int code, String error){
        super(error);
        this.code = code;
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    public static FortniteException parse(ResponseBody body) {
        try {
            ExceptionModel model = new Gson().fromJson(body.string(), ExceptionModel.class);
            return new FortniteException(model.status, model.error);
        } catch(Exception e){
            return new FortniteException(0, "Unknown");
        }
    }

}
