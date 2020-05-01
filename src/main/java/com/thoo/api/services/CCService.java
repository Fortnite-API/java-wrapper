package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.CreatorModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CCService {

    String BASE_URL = "https://fortnite-api.com/";

    @GET("/creatorcode")
    Call<BaseModel<CreatorModel>> get(@Query("slug") String slug);

    @GET("/creatorcode/search")
    Call<BaseModel<CreatorModel>> search(@Query("slug") String slug);

    @GET("/creatorcode/search/all")
    Call<BaseModel<CreatorModel[]>> searchAll(@Query("slug") String slug);

}
