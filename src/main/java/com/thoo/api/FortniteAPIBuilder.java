package com.thoo.api;

import com.thoo.api.enums.Language;

public final class FortniteAPIBuilder {

    private String apiKey; // This is not required anymore.
    private Language language = Language.EN;

    public FortniteAPIBuilder setKey(String apiKey){
        this.apiKey = apiKey;
        return this;
    }

    public FortniteAPIBuilder setDefaultLanguage(Language language){
        this.language = language;
        return this;
    }

    public FortniteAPI build(){
        return new FortniteAPIImpl(apiKey, language);
    }

}
