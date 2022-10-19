package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("adHierarchy")
    val adHierarchy: String,
    @SerializedName("attribution")
    val attribution: Attribution,
    @SerializedName("mpxCategoryName")
    val mpxCategoryName: String,
    @SerializedName("orderLineupId")
    val orderLineupId: String,
    @SerializedName("orderLineupSlug")
    val orderLineupSlug: String,
    @SerializedName("pageDescription")
    val pageDescription: String,
    @SerializedName("pageTitle")
    val pageTitle: String,
    @SerializedName("polopolyDeptName")
    val polopolyDeptName: String,
    @SerializedName("polopolyExternalId")
    val polopolyExternalId: String,
    @SerializedName("tracking")
    val tracking: Tracking
)