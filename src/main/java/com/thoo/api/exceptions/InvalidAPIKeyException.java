package com.thoo.api.exceptions;

public final class InvalidAPIKeyException extends Exception {

    public InvalidAPIKeyException(){
        super("Please use a valid API Key!");
    }

}
