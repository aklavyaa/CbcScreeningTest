package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class ContextualHeadline(
    @SerializedName("contextId")
    val contextId: Any,
    @SerializedName("contextualLineupSlug")
    val contextualLineupSlug: String,
    @SerializedName("headline")
    val headline: String,
    @SerializedName("headlineType")
    val headlineType: String,
    @SerializedName("pubQueueId")
    val pubQueueId: String
)