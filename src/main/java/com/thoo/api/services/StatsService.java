package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.StatsModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StatsService {

    @GET("/v1/stats/br/v2")
    Call<BaseModel<StatsModel>> stats(@Query("name") String name, @Query("accountType") String accountType, @Query("timeWindow") String timeWindow, @Query("image") String image);

    @GET("/v1/stats/br/v2/{accountId}")
    Call<BaseModel<StatsModel>> stats(@Path("accountId") String accountId, @Query("name") String name, @Query("accountType") String accountType, @Query("timeWindow") String timeWindow, @Query("image") String image);

}
