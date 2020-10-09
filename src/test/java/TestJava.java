import com.thoo.api.FortniteAPI;
import com.thoo.api.exceptions.FortniteApiException;
import com.thoo.api.models.Cosmetic;
import kotlin.Unit;

public final class TestJava {

    public static void main(String[] args) {
        try {
            FortniteAPI api = FortniteAPI.create();
            Cosmetic cosmetic = api.cosmetic.searchCosmetic(c -> {
                c.name = "test";
                return Unit.INSTANCE;
            }).getData();
            System.out.println(cosmetic.getName());
        } catch(FortniteApiException e) {
            e.printStackTrace();
        }
    }

}
