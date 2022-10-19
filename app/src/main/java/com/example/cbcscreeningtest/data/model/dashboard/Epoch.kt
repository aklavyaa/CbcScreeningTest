package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Epoch(
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("offtime")
    val offtime: String,
    @SerializedName("ontime")
    val ontime: String,
    @SerializedName("pubdate")
    val pubdate: String
)