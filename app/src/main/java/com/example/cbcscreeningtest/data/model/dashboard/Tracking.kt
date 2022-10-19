package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Tracking(
    @SerializedName("contentarea")
    val contentarea: String,
    @SerializedName("contenttype")
    val contenttype: String,
    @SerializedName("subsection1")
    val subsection1: String,
    @SerializedName("subsection2")
    val subsection2: String,
    @SerializedName("subsection3")
    val subsection3: String,
    @SerializedName("subsection4")
    val subsection4: String
)