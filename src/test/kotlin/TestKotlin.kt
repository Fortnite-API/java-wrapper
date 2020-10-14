import com.thoo.api.FortniteAPI
import com.thoo.api.enums.Language

object TestKotlin {

    @JvmStatic
    fun main(args: Array<String>) {
        val api = FortniteAPI.create(
                language = Language.DE
        )
        val cosmetic = api.cosmetic.searchCosmetic {
            name = "Aura"
        }
        println(cosmetic.data.name)
    }

}