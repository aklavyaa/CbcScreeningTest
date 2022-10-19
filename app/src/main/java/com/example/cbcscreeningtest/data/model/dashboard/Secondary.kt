package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Secondary(
    @SerializedName("content")
    val content: ContentX,
    @SerializedName("item")
    val item: ItemX,
    @SerializedName("localHeadline")
    val localHeadline: String,
    @SerializedName("localheadline")
    val localheadline: String,
    @SerializedName("type")
    val type: String
)