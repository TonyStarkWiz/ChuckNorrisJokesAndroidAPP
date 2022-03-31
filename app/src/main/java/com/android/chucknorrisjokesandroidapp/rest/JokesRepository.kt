package com.android.chucknorrisjokesandroidapp.rest

import com.android.chucknorrisjokesandroidapp.model.JokesResponse
import retrofit2.Response

interface JokesRepository {
    suspend fun getJokes(number: Int, firstName: String, lastName: String): Response<JokesResponse>
}

class MovieRepositoryImpl (
    private val jokesServices: Services
) : JokesRepository {

    override suspend fun getJokes(
        number: Int,
        firstName: String,
        lastName: String
    ): Response<JokesResponse> {
        return jokesServices.getJokes(number = number, firstName = firstName, lastName = lastName)
    }


}
