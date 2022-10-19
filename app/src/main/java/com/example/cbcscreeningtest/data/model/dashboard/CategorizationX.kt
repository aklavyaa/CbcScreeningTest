package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class CategorizationX(
    @SerializedName("dimensions")
    val dimensions: List<DimensionX>
)