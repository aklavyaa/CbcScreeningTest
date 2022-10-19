package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Primary(
    @SerializedName("content")
    val content: Content,
    @SerializedName("item")
    val item: Item,
    @SerializedName("localHeadline")
    val localHeadline: String,
    @SerializedName("localheadline")
    val localheadline: String,
    @SerializedName("type")
    val type: String
)