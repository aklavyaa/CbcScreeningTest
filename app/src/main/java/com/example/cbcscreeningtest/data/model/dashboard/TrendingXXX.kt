package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class TrendingXXX(
    @SerializedName("numViewers")
    val numViewers: Int,
    @SerializedName("numViewersSRS")
    val numViewersSRS: Int
)