package com.thoo.api.objects;

import com.thoo.api.model.BaseModel;
import com.thoo.api.model.StatsModel;
import com.thoo.api.services.StatsService;
import com.thoo.api.utils.HttpUtils;
import org.jetbrains.annotations.NotNull;

public class StatsSearcherId extends StatsSearcher {

    private String accountId;

    public StatsSearcherId(String accountId, StatsService service) {
        this.accountId = accountId;
        this.service = service;
    }

    public StatsSearcher setId(@NotNull String accountId){
        this.accountId = accountId;
        return this;
    }

    @Override
    public FortniteResponse<BaseModel<StatsModel>> send() {
        return HttpUtils.parse(service.stats(accountId, name, accountType.code, timeWindow.toString().toLowerCase(), imageType.code));
    }

}
