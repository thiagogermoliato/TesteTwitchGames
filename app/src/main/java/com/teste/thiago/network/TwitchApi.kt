package com.teste.thiago.network

import com.teste.thiago.model.TopGames
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface TwitchApi{

    @Headers("Client-ID: 0v5pepeik1wreaay4h9anoekh8iizy")
    @GET("/kraken/games/top")
    fun getTopGames(@Query("limit") limit: Int?, @Query("offset") offset: Int?): Call<TopGames>

}