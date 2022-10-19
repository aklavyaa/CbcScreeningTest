package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Body(
    @SerializedName("containsAudio")
    val containsAudio: Boolean,
    @SerializedName("containsPhotogallery")
    val containsPhotogallery: Boolean,
    @SerializedName("containsVideo")
    val containsVideo: Boolean
)