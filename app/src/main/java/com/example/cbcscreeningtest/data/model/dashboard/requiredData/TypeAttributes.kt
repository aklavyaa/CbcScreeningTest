package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class TypeAttributes(
    @Embedded
    @SerializedName("components")
    var components: Components?=null,
    @SerializedName("imageLarge")
    var imageLarge: String="",
    @SerializedName("imageSmall")
    var imageSmall: String="",

){
    constructor():this( null,imageLarge = "", imageSmall = "")
}