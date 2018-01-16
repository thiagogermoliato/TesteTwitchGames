package com.teste.thiago.model

import com.google.gson.annotations.SerializedName
import com.teste.thiago.model.GameItem
import com.teste.thiago.model.Links

data class TopGames(
        @SerializedName("_total")
        val total: Int,
        @SerializedName("_links")
        val links: Links,
        @SerializedName("top")
        val gameItemList: List<GameItem>)