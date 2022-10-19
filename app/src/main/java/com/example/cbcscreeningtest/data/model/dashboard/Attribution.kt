package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Attribution(
    @SerializedName("level1")
    val level1: String,
    @SerializedName("level2")
    val level2: String,
    @SerializedName("level3")
    val level3: String
)