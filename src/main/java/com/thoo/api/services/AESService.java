package com.thoo.api.services;

import com.thoo.api.model.AESModel;
import com.thoo.api.model.BaseModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface AESService {

    String BASE_URL = "https://fortnite-api.com/";

    @GET("/aes")
    Call<BaseModel<AESModel>> aes();

}
