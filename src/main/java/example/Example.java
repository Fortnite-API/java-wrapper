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
        this.api = new FortniteAPIBuilder().setKey("f58b42bd605c0c1c9067d0352bc75cf52a84e62c").setDefaultLanguage(Language.AR).build();
        this.api.getAESEndpoint().getAES().ifSuccessful(model -> {
            System.out.println(HttpUtils.gson.toJson(model.data));
        });
    }

    public static void main(String[] args) {
        new Example().main();
    }

}
