package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import com.google.gson.annotations.SerializedName

data class Primary(

    @SerializedName("localHeadline")
    var primLocalHeadline: String="",


){
    constructor():this(primLocalHeadline = "")
}