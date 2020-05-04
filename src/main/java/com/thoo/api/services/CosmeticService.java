package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrCosmetic;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CosmeticService {

    @GET("/v2/cosmetics/br")
    Call<BaseModel<BrCosmetic[]>> getCosmetics();

    @GET("/v2/cosmetics/br")
    Call<BaseModel<BrCosmetic[]>> getCosmetics(@Query("language") String language);

    @GET("/v2/cosmetics/br/{id}")
    Call<BaseModel<BrCosmetic>> getCosmeticsByID(@Path("id") String id);

    @GET("/v2/cosmetics/br/{id}")
    Call<BaseModel<BrCosmetic>> getCosmeticsByID(@Path("id") String id, @Query("language") String language);
}