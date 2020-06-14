package example;

import com.thoo.api.FortniteAPI;
import com.thoo.api.FortniteAPIBuilder;
import com.thoo.api.enums.Language;
import com.thoo.api.utils.HttpUtils;

public final class Example {

    private FortniteAPI api;

    private void main() {
        this.init();
    }

    private void init() {
        this.api = new FortniteAPIBuilder().setKey("").setDefaultLanguage(Language.EN).build();
        System.out.println(HttpUtils.gson.toJson(api.getAESEndpoint().getAES().getModel().data));
    }

    public static void main(String[] args) {
        new Example().main();
    }

}
