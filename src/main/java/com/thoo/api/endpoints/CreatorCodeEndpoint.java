package com.thoo.api.endpoints;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.CreatorModel;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.CCService;
import com.thoo.api.utils.HttpUtils;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class CreatorCodeEndpoint {

    private CCService service;
    private Retrofit retrofit;

    public CreatorCodeEndpoint(){
        this.retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(CCService.BASE_URL)
                .client(HttpUtils.client).build();
        this.service = retrofit.create(CCService.class);
    }

    public FortniteResponse<BaseModel<CreatorModel>> get(String slug){
        Call<BaseModel<CreatorModel>> call = service.get(slug);
        return HttpUtils.parse(call);
    }

    public FortniteResponse<BaseModel<CreatorModel>> search(String slug){
        Call<BaseModel<CreatorModel>> call = service.search(slug);
        return HttpUtils.parse(call);
    }

    public FortniteResponse<BaseModel<CreatorModel[]>> searchAll(String slug){
        Call<BaseModel<CreatorModel[]>> call = service.searchAll(slug);
        return HttpUtils.parse(call);
    }

}
