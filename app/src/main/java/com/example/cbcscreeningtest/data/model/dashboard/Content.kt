package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Content(
    @SerializedName("author")
    val author: AuthorXX,
    @SerializedName("authors")
    val authors: List<AuthorXXX>,
    @SerializedName("categories")
    val categories: List<String>,
    @SerializedName("categorization")
    val categorization: Categorization,
    @SerializedName("deck")
    val deck: String,
    @SerializedName("departments")
    val departments: List<Department>,
    @SerializedName("description")
    val description: String,
    @SerializedName("embeddedtypes")
    val embeddedtypes: String,
    @SerializedName("epoch")
    val epoch: Epoch,
    @SerializedName("extattrib")
    val extattrib: Extattrib,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("headline")
    val headline: String,
    @SerializedName("headlineimage")
    val headlineimage: Headlineimage,
    @SerializedName("headlinemedia")
    val headlinemedia: Headlinemedia,
    @SerializedName("id")
    val id: String,
    @SerializedName("intlinks")
    val intlinks: List<Intlink>,
    @SerializedName("jsonurl")
    val jsonurl: String,
    @SerializedName("label")
    val label: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("lastupdate")
    val lastupdate: String,
    @SerializedName("pubdate")
    val pubdate: String,
    @SerializedName("shareheadline")
    val shareheadline: String,
    @SerializedName("show")
    val show: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)