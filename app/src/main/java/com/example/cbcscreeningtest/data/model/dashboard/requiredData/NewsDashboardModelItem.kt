package com.example.cbcscreeningtest.data.model.dashboard.requiredData


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity(tableName = "recent_news")
data class NewsDashboardModelItem(
    @PrimaryKey
    @SerializedName("id")
    var id: Int=0,
    @SerializedName("publishedAt")
    var  publishedAt: Long=0,
    @SerializedName("readablePublishedAt")
    var readablePublishedAt: String="",
    @SerializedName("readableUpdatedAt")
    var readableUpdatedAt: String="",


    @SerializedName("title")
    var title: String="",
    @SerializedName("type")
    var type: String="",
    @Embedded
    @SerializedName("typeAttributes")
    var typeAttributes: TypeAttributes?=null,
    @SerializedName("updatedAt")
    var updatedAt: Long=0,

    ){
    constructor():this(id = 0, publishedAt = 0, readablePublishedAt = "", readableUpdatedAt = "", title = "", type = "",typeAttributes = null,updatedAt =0)
}