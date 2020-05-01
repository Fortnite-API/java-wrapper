package example;

import com.thoo.api.FortniteAPI;
import com.thoo.api.FortniteAPIBuilder;

public final class Example {

    /** TO:DO
     * Cosmetic - Search
     * Cosmetic - SearchAll
     * Cosmetic - SearchIds
     */

    private FortniteAPI api;

    private void main() {
        this.init();
    }

    private void init() {
        this.api = new FortniteAPIBuilder().setKey("").build();
    }

    public static void main(String[] args) {
        new Example().main();
    }

}
