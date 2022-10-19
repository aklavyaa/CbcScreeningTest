package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class HeadlineXXX(
    @SerializedName("image")
    val image: String,
    @SerializedName("mediaDuration")
    val mediaDuration: Int,
    @SerializedName("mediaId")
    val mediaId: String,
    @SerializedName("publishedAt")
    val publishedAt: Long,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String
)