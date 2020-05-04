package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.BrCosmetic;
import com.thoo.api.objects.FortniteResponse;
import com.thoo.api.services.CosmeticService;
import com.thoo.api.utils.HttpUtils;

import java.util.Arrays;
import java.util.Optional;

public final class CosmeticEndpoint extends Endpoint<CosmeticService> {

    public CosmeticEndpoint(Language defaultLanguage){
        super(CosmeticService.class, defaultLanguage);
    }

    public FortniteResponse<BaseModel<BrCosmetic[]>> getCosmetics(){
        return HttpUtils.parse(service.getCosmetics(defaultLanguage.code));
    }

    public FortniteResponse<BaseModel<BrCosmetic[]>> getCosmetics(Language language){
        return HttpUtils.parse(service.getCosmetics(language.code));
    }

    public FortniteResponse<BaseModel<BrCosmetic>> getCosmeticByID(String id){
        return HttpUtils.parse(service.getCosmeticsByID(id, defaultLanguage.code));
    }

    public FortniteResponse<BaseModel<BrCosmetic>> getCosmeticByID(String id, Language language){
        return HttpUtils.parse(service.getCosmeticsByID(id, language.code));
    }

    public Optional<BrCosmetic> getCosmeticByName(String name){
        return getCosmeticByName(name, defaultLanguage);
    }

    public Optional<BrCosmetic> getCosmeticByName(String name, Language language){
        FortniteResponse<BaseModel<BrCosmetic[]>> cosmetics =  HttpUtils.parse(service.getCosmetics(language.code));
        if(cosmetics.isSuccessful()){
            return Arrays.stream(cosmetics.getModel().data).filter(cosmetic -> cosmetic.name.equalsIgnoreCase(name)).findFirst();
        } else {
            return Optional.empty();
        }
    }

}
