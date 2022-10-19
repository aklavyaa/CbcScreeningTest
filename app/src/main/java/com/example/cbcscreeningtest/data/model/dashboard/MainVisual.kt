package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class MainVisual(
    @SerializedName("altText")
    val altText: String,
    @SerializedName("createdAt")
    val createdAt: Long,
    @SerializedName("credit")
    val credit: String,
    @SerializedName("derivatives")
    val derivatives: Derivatives,
    @SerializedName("description")
    val description: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("modifiedAt")
    val modifiedAt: Long,
    @SerializedName("readableCreatedAt")
    val readableCreatedAt: String,
    @SerializedName("readableModifiedAt")
    val readableModifiedAt: String,
    @SerializedName("sourceId")
    val sourceId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("useOriginalImage")
    val useOriginalImage: Boolean,
    @SerializedName("version")
    val version: String,
    @SerializedName("width")
    val width: Int
)