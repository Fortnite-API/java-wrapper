import com.google.gson.Gson
import com.thoo.api.FortniteAPI
import com.thoo.api.utils.QueryBuilder

object Test {

    @JvmStatic
    fun main(args: Array<String>) {
        val api = FortniteAPI.Builder().build()
        val query = QueryBuilder(
                name = "Aura"
        )
        val test = api.getCosmeticEndpoint().searchCosmetic(query)
        println(Gson().toJson(test))
    }

}