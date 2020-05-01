# java-wrapper
Java/Kotlin implementation for https://fortnite-api.com


# Example
Note: For every method you can use the `Language` parameter.
```java
FortniteAPI api = new FortniteAPIBuilder()
                  .setKey("{API-KEY}");
CosmeticEndpoint endpoint = api.getCosmeticEndpoint();
FortniteResponse<BaseModel<BrCosmetic>> response = endpoint.getCosmetics();
response.ifSuccessfull(cosmetics -> {
  for(BrCosmetic cosmetic : cosmetics){
    System.out.println(cosmetic.name);
  }
});
```
