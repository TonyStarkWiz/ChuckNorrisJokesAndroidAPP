package com.android.chucknorrisjokesandroidapp.model


import com.google.gson.annotations.SerializedName

data class Value(
    @SerializedName("categories")
    val categories: List<String>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("joke")
    val joke: String
)