package com.thoo.api.endpoints;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.CreatorModel;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.CCService;
import com.thoo.api.utils.HttpUtils;
import retrofit2.Call;

public final class CreatorCodeEndpoint extends Endpoint<CCService> {

    public CreatorCodeEndpoint(){
        super(CCService.class);
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
