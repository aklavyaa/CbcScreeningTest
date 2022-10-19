package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Categorization(
    @SerializedName("dimensions")
    val dimensions: List<Dimension>
)