package com.thoo.api.services;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrShop;
import com.thoo.api.model.BrShopCombined;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShopService {

    @GET("/v2/shop/br")
    Call<BaseModel<BrShop>> shop();

    @GET("/v2/shop/br")
    Call<BaseModel<BrShop>> shop(@Query("language") String language);

    @GET("/v2/shop/br/combined")
    Call<BaseModel<BrShopCombined>> shopCombined();

    @GET("/v2/shop/br/combined")
    Call<BaseModel<BrShopCombined>> shopCombined(@Query("language") String language);

}
