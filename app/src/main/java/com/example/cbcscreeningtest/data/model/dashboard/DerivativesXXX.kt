package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class DerivativesXXX(
    @SerializedName("original_300")
    val original300: Original300X,
    @SerializedName("original_620")
    val original620: Original620X,
    @SerializedName("square_140")
    val square140: Square140XXX,
    @SerializedName("square_220")
    val square220: Square220X,
    @SerializedName("square_60")
    val square60: Square60X,
    @SerializedName("16x9_300")
    val x9300: X111180,
    @SerializedName("16x9_460")
    val x9460: X111180,
    @SerializedName("16x9_620")
    val x9620: X111180,
    @SerializedName("16x9_780")
    val x9780: X111180,
    @SerializedName("16x9_940")
    val x9940: X111180,
    @SerializedName("16x9tight_140")
    val x9tight140: X9tight140X
)