package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class MainContent(
//    @Embedded
//    @SerializedName("primary")
//    var prim: ArrayList<Primary>?=null,
//
//    @Embedded
//    @SerializedName("secondary")
//    var secon: ArrayList<Secondary>?=null,


@SerializedName("description")
var description : String = ""




    ){
    constructor():this(description="")
}