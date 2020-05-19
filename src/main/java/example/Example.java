package example;

import com.thoo.api.FortniteAPI;
import com.thoo.api.FortniteAPIBuilder;
import com.thoo.api.enums.ImageType;
import com.thoo.api.enums.Language;
import com.thoo.api.enums.TimeWindow;
import com.thoo.api.model.AccountType;
import com.thoo.api.model.BaseModel;
import com.thoo.api.model.StatsModel;
import com.thoo.api.objects.FortniteResponse;

public final class Example {

    private FortniteAPI api;

    private void main() {
        this.init();
    }

    private void init() {
        this.api = new FortniteAPIBuilder().setKey("").setDefaultLanguage(Language.EN).build();
        FortniteResponse<BaseModel<StatsModel>> response = api.getStatsEndpoint().getStatsByID("")
            .setImageType(ImageType.ALL).setAccountType(AccountType.PC).setTimeWindow(TimeWindow.LIFETIME).send();
        StatsModel model = response.getModel().data;
        System.out.println(model.battlePass.level);
    }

    public static void main(String[] args) {
        new Example().main();
    }

}
