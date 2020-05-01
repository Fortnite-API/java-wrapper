package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrCosmetic;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CosmeticService {

    @GET("/cosmetics/br")
    Call<BaseModel<BrCosmetic[]>> getCosmetics();

    @GET("/cosmetics/br")
    Call<BaseModel<BrCosmetic[]>> getCosmetics(@Query("language") String language);

    @GET("/cosmetics/br/{id}")
    Call<BaseModel<BrCosmetic>> getCosmeticsByID(@Path("id") String id);

    @GET("/cosmetics/br/{id}")
    Call<BaseModel<BrCosmetic>> getCosmeticsByID(@Path("id") String id, @Query("language") String language);
}