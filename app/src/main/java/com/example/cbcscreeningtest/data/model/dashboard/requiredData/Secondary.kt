package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import com.google.gson.annotations.SerializedName

data class Secondary(

    @SerializedName("localHeadline")
    var seconLocalHeadline: String="",

){
    constructor():this(seconLocalHeadline = "")
}