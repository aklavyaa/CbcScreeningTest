package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Bio(
    @SerializedName("biography")
    val biography: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("photo")
    val photo: Photo,
    @SerializedName("title")
    val title: String
)