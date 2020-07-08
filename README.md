# Fortnite-API.com Wrapper
This wrapper is wrote in Kotlin but is fully supported in Java. But Kotlin is very recommended.

NOTE: This is not supported for Java 12+

# Examples

###### Java:
```java
// Creates a new instance of the FortniteAPI class
FortniteAPI api = new FortniteAPI.Builder()
                      .setKey("{KEY}") // An API-Key is optional
                      .setLanguage(Language.EN) // Optional, Default is EN
                      .setClient({OkHttpClient}) // Optional
                      .build();
// This class has all the methods
CosmeticEndpoint cosmeticEndpoint = api.getCosmeticEndpoint();
// Sends a request to /v2/cosmetics/br
val cosmetics = cosmeticEndpoint.getCosmetics().data;
for(Cosmetic cosmetic : cosmetics){
    System.out.println(cosmetic.name);
}
```
###### Kotlin
```kotlin
// Creates a new instance of the FortniteAPI class
val api: FortniteAPI = FortniteAPI.Builder()
                      .setKey("{KEY}") // An API-Key is optional
                      .setLanguage(Language.EN) // Optional, Default is EN
                      .setClient({OkHttpClient}) // Optional
                      .build()
// This class has all the methods
val cosmeticEndpoint = api.getCosmeticEndpoint()
// Sends a request to /v2/cosmetics/br
val cosmetics = cosmeticEndpoint.getCosmetics().data
for(cosmetic in cosmetics){
    println(cosmetic.name)
}
```
The rest of the classes/methods are pretty much self-explanatory.
If you have any issues, suggestions or improvements; Please send me a DM on Discord.