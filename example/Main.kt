package example

import com.thoo.api.FortniteAPI

fun main(args :  Array<String>){
    val api: FortniteAPI = FortniteAPI()

    api.getAllCosmetics()?.data?.forEach {
        println(it.name)
    }
}