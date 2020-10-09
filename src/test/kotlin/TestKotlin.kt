import com.google.gson.Gson
import com.thoo.api.FortniteAPI
import com.thoo.api.enums.Language

object TestKotlin {

    @JvmStatic
    fun main(args: Array<String>) {
        val api = FortniteAPI.create(
                language = Language.DE
        )
        val cosmetic = api.cosmetic.searchCosmetic {
            name = "tsdfsdfs"
        }
        println(cosmetic.data.name)
    }

}