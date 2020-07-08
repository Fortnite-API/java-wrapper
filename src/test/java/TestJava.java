import com.thoo.api.FortniteAPI;
import com.thoo.api.enums.Language;

public class TestJava {

    public static void main(String[] args) {
        FortniteAPI api = new FortniteAPI.Builder().setLanguage(Language.EN).setDebug(true).build();
    }

}
