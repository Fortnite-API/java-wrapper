package com.thoo.api.objects;

import com.thoo.api.model.AccountType;
import com.thoo.api.enums.ImageType;
import com.thoo.api.enums.TimeWindow;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.StatsModel;
import com.thoo.api.services.StatsService;
import com.thoo.api.utils.HttpUtils;
import org.jetbrains.annotations.NotNull;

public class StatsSearcher {

    protected StatsService service;
    protected AccountType accountType = AccountType.PC;
    protected TimeWindow timeWindow = TimeWindow.LIFETIME;
    protected ImageType imageType = ImageType.NONE;
    protected String name;

    public StatsSearcher(String name , StatsService service){
        this.service = service;
        this.name = name;
    }

    public StatsSearcher(){}

    public StatsSearcher setAccountType(@NotNull AccountType accountType){
        this.accountType = accountType;
        return this;
    }

    public StatsSearcher setTimeWindow(@NotNull TimeWindow timeWindow){
        this.timeWindow = timeWindow;
        return this;
    }


    public StatsSearcher setImageType(@NotNull ImageType imageType){
        this.imageType = imageType;
        return this;
    }

    public FortniteResponse<BaseModel<StatsModel>> send() {
        return HttpUtils.parse(service.stats(name, accountType.code, timeWindow.toString().toLowerCase(), imageType.code));
    }

}
