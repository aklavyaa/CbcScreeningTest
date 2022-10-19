package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class TypeAttributesXXX(
    @SerializedName("author")
    val author: AuthorXXXXXXX,
    @SerializedName("body")
    val body: BodyXXX,
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
    val flags: FlagsXX,
    @SerializedName("headline")
    val headline: HeadlineXX,
    @SerializedName("imageAspects")
    val imageAspects: String,
    @SerializedName("imageLarge")
    val imageLarge: String,
    @SerializedName("imageSmall")
    val imageSmall: String,
    @SerializedName("media")
    val media: Any,
    @SerializedName("mediaCaptionUrl")
    val mediaCaptionUrl: Any,
    @SerializedName("mediaDuration")
    val mediaDuration: Any,
    @SerializedName("mediaId")
    val mediaId: Any,
    @SerializedName("mediaStreamType")
    val mediaStreamType: Any,
    @SerializedName("sectionLabels")
    val sectionLabels: List<String>,
    @SerializedName("sectionList")
    val sectionList: List<String>,
    @SerializedName("show")
    val show: String,
    @SerializedName("showSlug")
    val showSlug: String,
    @SerializedName("trending")
    val trending: TrendingXX,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlSlug")
    val urlSlug: String
)