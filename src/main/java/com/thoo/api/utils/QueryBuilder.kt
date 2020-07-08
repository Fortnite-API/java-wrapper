package com.thoo.api.utils

import com.thoo.api.enums.Language
import com.thoo.api.enums.MatchMethod

class QueryBuilder(
        internal var searchLanguage: Language? = null,
        internal var mathMethod: MatchMethod ? = null,
        internal var id: String? = null,
        internal var name: String? = null,
        internal var description: String? = null,
        internal var type: String? = null,
        internal var displayType: String? = null,
        internal var rarity: String? = null,
        internal var displayRarity: String? = null,
        internal var backendRarity: String? = null,
        internal var hasSeries: Boolean? = null,
        internal var series: String? = null,
        internal var backendSeries: String? = null,
        internal var hasSet: Boolean? = null,
        internal var set: String? = null,
        internal var setText: String? = null,
        internal var backendSet: String? = null,
        internal var hasIntroduction: Boolean? = null,
        internal var introductionChapter: String? = null,
        internal var introductionSeason: String? = null,
        internal var hasFeaturedImage: Boolean? = null,
        internal var hasVariants: Boolean? = null,
        internal var gameplayTags: String? = null,
        internal var added: Long? = null,
        internal var addedSince: Long? = null,
        internal var unseenFor: Int? = null,
        internal var lastAppearance: Long? = null
)