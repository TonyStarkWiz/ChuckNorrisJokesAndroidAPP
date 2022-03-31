package com.android.chucknorrisjokesandroidapp.rest

import com.android.chucknorrisjokesandroidapp.model.JokesResponse
import com.android.chucknorrisjokesandroidapp.model.Value
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Services {
    @GET("$pathOfAPI{number}")
    suspend fun getJokes(
        @Path("number") number : Int = 100,
        @Query("firstName") firstName: String,
        @Query("lastName") lastName: String
    ): Response<JokesResponse>

    companion object {
        //http://api.icndb.com/jokes/random?firstName=Chuck&lastName=Norris
        const val baseURL = "http://api.icndb.com/jokes/"
        private const val pathOfAPI = "random/"

    }
}