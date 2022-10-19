package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("alt")
    val alt: String,
    @SerializedName("credit")
    val credit: String,
    @SerializedName("deck")
    val deck: String,
    @SerializedName("derivatives")
    val derivatives: DerivativesX,
    @SerializedName("description")
    val description: String,
    @SerializedName("headline")
    val headline: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("jsonurl")
    val jsonurl: String,
    @SerializedName("originalimage")
    val originalimage: Originalimage,
    @SerializedName("originalimageurl")
    val originalimageurl: String,
    @SerializedName("size")
    val size: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("useoriginalimage")
    val useoriginalimage: Boolean
)