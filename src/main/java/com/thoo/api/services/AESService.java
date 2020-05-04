package com.thoo.api.services;

import com.thoo.api.model.AESModel;
import com.thoo.api.model.BaseModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AESService {

    String BASE_URL = "https://fortnite-api.com/";

    @GET("/v2/aes")
    Call<BaseModel<AESModel>> aes();

    @GET("/v2/aes")
    Call<BaseModel<AESModel>> aes(@Query("keyFormat") String keyFormat);

}
