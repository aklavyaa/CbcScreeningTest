package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class TypeAttributes(
    @SerializedName("author")
    val author: Author,
    @SerializedName("body")
    val body: Body,
    @SerializedName("categories")
    val categories: List<Category>,
    @SerializedName("commentsSectionId")
    val commentsSectionId: String,
    @SerializedName("components")
    val components: Components,
    @SerializedName("contextualHeadlines")
    val contextualHeadlines: List<ContextualHeadline>,
    @SerializedName("deck")
    val deck: String,
    @SerializedName("displayComments")
    val displayComments: Boolean,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("flags")
    val flags: FlagsXXX,
    @SerializedName("headline")
    val headline: HeadlineXXX,
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
    val trending: TrendingXXX,
    @SerializedName("uppercaseHeadline")
    val uppercaseHeadline: Boolean,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlSlug")
    val urlSlug: String
)