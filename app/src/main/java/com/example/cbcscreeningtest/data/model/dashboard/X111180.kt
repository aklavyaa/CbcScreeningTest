package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class X111180(
    @SerializedName("fileurl")
    val fileurl: String,
    @SerializedName("h")
    val h: Int,
    @SerializedName("w")
    val w: Int
)