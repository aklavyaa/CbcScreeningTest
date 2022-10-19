package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class DerivativesXX(
    @SerializedName("square_140")
    val square140: Square140XX,
    @SerializedName("square_300")
    val square300: Square300XX,
    @SerializedName("square_620")
    val square620: Square620XX
)