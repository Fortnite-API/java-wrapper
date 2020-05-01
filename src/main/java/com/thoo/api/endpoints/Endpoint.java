package com.thoo.api.endpoints;

import com.thoo.api.utils.HttpUtils;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class Endpoint<T> {

    protected final Retrofit retrofit;
    protected final T service;

    public Endpoint(Class<? extends T> service){
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(HttpUtils.gson))
                .baseUrl("https://fortnite-api.com/")
                .client(HttpUtils.client).build();
        this.service = retrofit.create(service);
    }

}
