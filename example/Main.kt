package example

import com.thoo.api.FortniteAPI
import com.thoo.api.search.SearchBuilder

fun main(args :  Array<String>){
    val api: FortniteAPI = FortniteAPI("")

    // Returns an Array<BRCosmeticData> of cosmetics which is an outfit and has a rare rarity
    val matchBuilder = SearchBuilder().setRarity("rare").setType("outfit")
    api.getMatchedCosmetics(matchBuilder)?.data?.forEach {
        println(it.id)
    }

}