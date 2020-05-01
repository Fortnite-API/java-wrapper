package com.thoo.api;

public final class FortniteAPIBuilder {

    private String apiKey;

    public FortniteAPIBuilder setKey(String apiKey){
        this.apiKey = apiKey;
        return this;
    }

    public FortniteAPI build(){
        return new FortniteAPIImpl(apiKey);
    }

}
