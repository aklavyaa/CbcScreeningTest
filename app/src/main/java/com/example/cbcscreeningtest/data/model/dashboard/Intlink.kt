package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Intlink(
    @SerializedName("description")
    val description: String,
    @SerializedName("embeddedtypes")
    val embeddedtypes: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("jsonurl")
    val jsonurl: String,
    @SerializedName("shareheadline")
    val shareheadline: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)