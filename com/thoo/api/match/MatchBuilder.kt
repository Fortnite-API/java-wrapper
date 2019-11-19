package com.thoo.api.match

class MatchBuilder {

    private var type: String? = null
    private var backendType: String? = null
    private var rarity: String? = null
    private var backendRarity: String? = null
    private var name: String? = null
    private var shortDescription: String? = null
    private var description: String? = null
    private var set: String? = null
    private var series: String? = null
    private var backendSeries: String? = null
    private var hasSmallIcon: Boolean? = null
    private var hasIcon: Boolean? = null
    private var hasFeaturedImage: Boolean? = null
    private var hasBackgroundImage: Boolean? = null
    private var hasCovertArt: Boolean? = null
    private var hasDecal: Boolean? = null
    private var hasVariants: Boolean? = null
    private var hasGameplayTags: Boolean? = null
    private var gameplayTag: String? = null
    private var displayRarity: String? = null
    private var setText: String? = null

    fun setDisplayRarity(displayRarity: String):MatchBuilder {
        this.displayRarity = displayRarity
        return this
    }

    fun setText(setText: String):MatchBuilder {
        this.setText = setText
        return this
    }

    fun setType(type: String):MatchBuilder {
        this.type = type
        return this
    }

    fun setBackendType(backendType: String):MatchBuilder {
        this.backendType = backendType
        return this
    }

    fun setRarity(rarity: String):MatchBuilder {
        this.rarity = rarity
        return this
    }

    fun setBackendRarity(backendRarity: String):MatchBuilder {
        this.backendRarity = backendRarity
        return this
    }

    fun setName(name: String):MatchBuilder {
        this.name = name
        return this
    }

    fun setShortDescription(shortDescription: String):MatchBuilder {
        this.shortDescription = shortDescription
        return this
    }

    fun setDescription(description: String):MatchBuilder {
        this.description = description
        return this
    }

    fun setSet(set: String):MatchBuilder {
        this.set = set
        return this
    }

    fun setSeries(series: String):MatchBuilder {
        this.series = series
        return this
    }

    fun setBackendSeries(backendSeries: String):MatchBuilder {
        this.backendSeries = backendSeries
        return this
    }

    fun setSmallIcon(hasSmallIcon: Boolean):MatchBuilder {
        this.hasSmallIcon = hasSmallIcon
        return this
    }

    fun setIcon(hasIcon: Boolean):MatchBuilder {
        this.hasIcon = hasIcon
        return this
    }

    fun setFeaturedImage(hasFeaturedImage: Boolean):MatchBuilder {
        this.hasFeaturedImage = hasFeaturedImage
        return this
    }

    fun setBackgroundImage(hasBackgroundImage: Boolean):MatchBuilder {
        this.hasBackgroundImage = hasBackgroundImage
        return this
    }

    fun setCovertArt(hasCovertArt: Boolean):MatchBuilder {
        this.hasCovertArt = hasCovertArt
        return this
    }

    fun setDecal(hasDecal: Boolean):MatchBuilder {
        this.hasDecal = hasDecal
        return this
    }

    fun setVariants(hasVariants: Boolean):MatchBuilder {
        this.hasVariants = hasVariants
        return this
    }

    fun setGameplayTags(hasGameplayTags: Boolean):MatchBuilder {
        this.hasGameplayTags = hasGameplayTags
        return this
    }

    fun setGameplayTag(gameplayTag: String):MatchBuilder {
        this.gameplayTag = gameplayTag
        return this
    }

}