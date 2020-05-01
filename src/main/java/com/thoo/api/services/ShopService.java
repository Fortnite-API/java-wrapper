package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrShop;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShopService {

    @GET("/shop/br")
    Call<BaseModel<BrShop>> shop();

    @GET("/shop/br")
    Call<BaseModel<BrShop>> shop(@Query("language") String language);

}
