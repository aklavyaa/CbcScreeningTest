package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class TypeAttributesXX(
    @SerializedName("author")
    val author: AuthorXXXX,
    @SerializedName("body")
    val body: BodyXX,
    @SerializedName("categories")
    val categories: Any,
    @SerializedName("commentsSectionId")
    val commentsSectionId: String,
    @SerializedName("contextualHeadlines")
    val contextualHeadlines: Any,
    @SerializedName("deck")
    val deck: String,
    @SerializedName("displayComments")
    val displayComments: Boolean,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("flags")
    val flags: FlagsX,
    @SerializedName("headline")
    val headline: HeadlineX,
    @SerializedName("imageAspects")
    val imageAspects: String,
    @SerializedName("imageLarge")
    val imageLarge: String,
    @SerializedName("imageSmall")
    val imageSmall: String,
    @SerializedName("media")
    val media: Any,
    @SerializedName("mediaCaptionUrl")
    val mediaCaptionUrl: String,
    @SerializedName("mediaDuration")
    val mediaDuration: Int,
    @SerializedName("mediaId")
    val mediaId: String,
    @SerializedName("mediaStreamType")
    val mediaStreamType: String,
    @SerializedName("sectionLabels")
    val sectionLabels: List<String>,
    @SerializedName("sectionList")
    val sectionList: List<String>,
    @SerializedName("show")
    val show: String,
    @SerializedName("showSlug")
    val showSlug: String,
    @SerializedName("trending")
    val trending: TrendingX,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlSlug")
    val urlSlug: String
)