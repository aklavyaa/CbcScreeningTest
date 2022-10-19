package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class ItemX(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("draft")
    val draft: Boolean,
    @SerializedName("embedTypes")
    val embedTypes: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: ImagesXXX,
    @SerializedName("language")
    val language: String,
    @SerializedName("publishedAt")
    val publishedAt: Long,
    @SerializedName("readablePublishedAt")
    val readablePublishedAt: String,
    @SerializedName("readableUpdatedAt")
    val readableUpdatedAt: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("sourceId")
    val sourceId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("typeAttributes")
    val typeAttributes: TypeAttributesXXX,
    @SerializedName("updatedAt")
    val updatedAt: Long,
    @SerializedName("version")
    val version: String
)