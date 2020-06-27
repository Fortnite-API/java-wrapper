import com.thoo.api.FortniteAPI

object Test {

    @JvmStatic
    fun main(args: Array<String>) {
        val api = FortniteAPI.Builder().build()
        val cc = api.getCreatorEndpoint()
        val code = cc.getCreatorCode("Teveelgevraagd")
    }

}