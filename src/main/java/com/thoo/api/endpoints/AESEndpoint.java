package com.thoo.api.endpoints;

import com.thoo.api.model.AESKeyFormat;
import com.thoo.api.model.AESModel;
import com.thoo.api.model.BaseModel;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.AESService;
import com.thoo.api.utils.HttpUtils;
import retrofit2.Call;

public final class AESEndpoint extends Endpoint<AESService> {

    public AESEndpoint(){
        super(AESService.class);
    }

    public FortniteResponse<BaseModel<AESModel>> getAES() {
        Call<BaseModel<AESModel>> call = service.aes();
        return HttpUtils.parse(call);
    }

    public FortniteResponse<BaseModel<AESModel>> getAES(AESKeyFormat format) {
        Call<BaseModel<AESModel>> call = service.aes(format.toString().toLowerCase());
        return HttpUtils.parse(call);
    }

}
