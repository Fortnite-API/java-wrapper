package com.thoo.api.search

class SearchBuilder {

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

    fun setDisplayRarity(displayRarity: String):SearchBuilder {
        this.displayRarity = displayRarity
        return this
    }

    fun setText(setText: String):SearchBuilder {
        this.setText = setText
        return this
    }

    fun setType(type: String):SearchBuilder {
        this.type = type
        return this
    }

    fun setBackendType(backendType: String):SearchBuilder {
        this.backendType = backendType
        return this
    }

    fun setRarity(rarity: String):SearchBuilder {
        this.rarity = rarity
        return this
    }

    fun setBackendRarity(backendRarity: String):SearchBuilder {
        this.backendRarity = backendRarity
        return this
    }

    fun setName(name: String):SearchBuilder {
        this.name = name
        return this
    }

    fun setShortDescription(shortDescription: String):SearchBuilder {
        this.shortDescription = shortDescription
        return this
    }

    fun setDescription(description: String):SearchBuilder {
        this.description = description
        return this
    }

    fun setSet(set: String):SearchBuilder {
        this.set = set
        return this
    }

    fun setSeries(series: String):SearchBuilder {
        this.series = series
        return this
    }

    fun setBackendSeries(backendSeries: String):SearchBuilder {
        this.backendSeries = backendSeries
        return this
    }

    fun setSmallIcon(hasSmallIcon: Boolean):SearchBuilder {
        this.hasSmallIcon = hasSmallIcon
        return this
    }

    fun setIcon(hasIcon: Boolean):SearchBuilder {
        this.hasIcon = hasIcon
        return this
    }

    fun setFeaturedImage(hasFeaturedImage: Boolean):SearchBuilder {
        this.hasFeaturedImage = hasFeaturedImage
        return this
    }

    fun setBackgroundImage(hasBackgroundImage: Boolean):SearchBuilder {
        this.hasBackgroundImage = hasBackgroundImage
        return this
    }

    fun setCovertArt(hasCovertArt: Boolean):SearchBuilder {
        this.hasCovertArt = hasCovertArt
        return this
    }

    fun setDecal(hasDecal: Boolean):SearchBuilder {
        this.hasDecal = hasDecal
        return this
    }

    fun setVariants(hasVariants: Boolean):SearchBuilder {
        this.hasVariants = hasVariants
        return this
    }

    fun setGameplayTags(hasGameplayTags: Boolean):SearchBuilder {
        this.hasGameplayTags = hasGameplayTags
        return this
    }

    fun setGameplayTag(gameplayTag: String):SearchBuilder {
        this.gameplayTag = gameplayTag
        return this
    }

}