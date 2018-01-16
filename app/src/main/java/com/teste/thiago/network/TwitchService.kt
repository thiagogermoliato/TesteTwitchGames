package com.teste.thiago.network

import com.teste.thiago.model.TopGames
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

object TwitchService{
    private val twitchApi: TwitchApi

    init {
            val builder = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.twitch.tv")
                    .build()


            twitchApi = builder.create(TwitchApi::class.java)
        }

    fun getGames(limit: Int, offset: Int): Call<TopGames> {
        return twitchApi.getTopGames(limit, offset)
    }
}