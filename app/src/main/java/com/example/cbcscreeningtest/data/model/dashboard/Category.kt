package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("bannerImage")
    val bannerImage: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("metadata")
    val metadata: Metadata,
    @SerializedName("name")
    val name: String,
    @SerializedName("path")
    val path: String,
    @SerializedName("priority")
    val priority: Int,
    @SerializedName("priorityWhenInlined")
    val priorityWhenInlined: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("type")
    val type: String
)