package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Headline(
    @SerializedName("mediaId")
    val mediaId: String,
    @SerializedName("type")
    val type: String
)