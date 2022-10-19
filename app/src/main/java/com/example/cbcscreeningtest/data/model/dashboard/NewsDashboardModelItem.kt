package com.example.cbcscreeningtest.data.model.dashboard


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity(tableName = "recent_news")
data class NewsDashboardModelItem(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("draft")
    val draft: Boolean,
    @SerializedName("embedTypes")
    val embedTypes: String,

    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: Images,
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
    val typeAttributes: TypeAttributes,
    @SerializedName("updatedAt")
    val updatedAt: Long,
    @SerializedName("version")
    val version: String
)