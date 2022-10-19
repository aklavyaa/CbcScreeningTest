package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class BioX(
    @SerializedName("biography")
    val biography: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("photo")
    val photo: PhotoXX,
    @SerializedName("title")
    val title: String
)