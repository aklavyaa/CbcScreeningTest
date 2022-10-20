package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Components(
//    @Embedded
//    @SerializedName("primary")
//    var prim: ArrayList<Primary>?=null,
//
//    @Embedded
//    @SerializedName("secondary")
//    var secon: ArrayList<Secondary>?=null,

@Embedded
@SerializedName("mainContent")
var mainContent : MainContent? = null




    ){
    constructor():this(mainContent=null)
}