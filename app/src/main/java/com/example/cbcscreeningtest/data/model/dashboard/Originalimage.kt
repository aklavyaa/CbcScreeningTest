package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Originalimage(
    @SerializedName("fileurl")
    val fileurl: String,
    @SerializedName("h")
    val h: Int,
    @SerializedName("w")
    val w: Int
)