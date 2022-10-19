package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class DerivativesX(
    @SerializedName("square_140")
    val square140: Square140X,
    @SerializedName("square_300")
    val square300: Square300X,
    @SerializedName("square_620")
    val square620: Square620X
)