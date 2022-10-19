package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class AuthorXXXXX(
    @SerializedName("authors")
    val authors: List<String>,
    @SerializedName("bio")
    val bio: BioX
)