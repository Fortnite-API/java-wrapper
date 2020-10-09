package com.thoo.api.models

import java.util.*

class Playlist(
        val id: String,
        val name: String,
        val subName: String,
        val description: String,
        val gameType: String,
        val minPlayers: Int,
        val maxPlayers: Int,
        val maxTeams: Int,
        val maxTeamSize: Int,
        val maxSquads: Int,
        val maxSquadSize: Int,
        val isDefault: Boolean,
        val isTournament: Boolean,
        val isLimitedTimeMode: Boolean,
        val isLargeTeamGame: Boolean,
        val accumulateToProfileStats: Boolean,
        val images: PlaylistImages,
        val gameplayTags: List<String>,
        val path: String,
        val added: Date
)

class PlaylistImages(
        val showcase: String,
        val missionIcon: String
)