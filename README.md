# Java

```java
FortniteAPI api = new FortniteAPI();
```

**Methods**\
For every method, You can set a custom language. (You have to add the Language (Language.class) to the last parameter)

```java
BRCosmeticResponse getCosmeticByID(String id);
BRCosmeticsResponse getAllCosmetics();
BRCosmeticsResponse getCosmeticsByID(String[] ids)
BRItemShop getItemShop();
NewsResponse getNews();
SepNewsResponse getNewsBR();
SepNewsResponse getNewsSTW();
SepNewsResponse getNewsCreative();
```

# Kotlin

```kotlin
val api: FortniteAPI = FortniteAPI()
```

**Methods**\
For every method, You can set a custom language. (You have to add the Language (Language.class) to the last parameter)

```kotlin
fun getCosmeticByID(id: String): BRCosmeticResponse?
fun getAllCosmetics(): BRCosmeticsResponse? = service?.getAllCosmetics()?
fun getCosmeticsByID(ids: Array<String>): BRCosmeticsResponse? 
fun getItemShop(): BRItemShop?
fun getNews(): NewsResponse?
fun getNewsBR(): SepNewsResponse?
fun getNewsSTW(): SepNewsResponse?
fun getNewsCreative(): SepNewsResponse?
```
