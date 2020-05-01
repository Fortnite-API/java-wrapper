package com.thoo.api.endpoints;

import com.thoo.api.model.AESModel;
import com.thoo.api.model.BaseModel;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.AESService;
import com.thoo.api.utils.HttpUtils;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class AESEndpoint {

    private AESService service;
    private Retrofit retrofit;

    public AESEndpoint(){
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AESService.BASE_URL)
                .client(HttpUtils.client).build();
        this.service = retrofit.create(AESService.class);
    }

    public FortniteResponse<BaseModel<AESModel>> getAES() {
        Call<BaseModel<AESModel>> call = service.aes();
        return HttpUtils.parse(call);
    }

}
