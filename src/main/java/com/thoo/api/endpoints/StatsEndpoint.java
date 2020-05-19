package com.thoo.api.endpoints;

import com.thoo.api.enums.Language;
import com.thoo.api.objects.StatsSearcher;
import com.thoo.api.objects.StatsSearcherId;
import com.thoo.api.services.StatsService;

public final class StatsEndpoint extends Endpoint<StatsService> {

    public StatsEndpoint(Language defaultLanguage) {
        super(StatsService.class, defaultLanguage);
    }

    public StatsSearcher getStats(String name){
        return new StatsSearcher(name, service);
    }

    public StatsSearcherId getStatsByID(String accountId){
        return new StatsSearcherId(accountId, service);
    }

}
