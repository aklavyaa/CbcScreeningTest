package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Components(
    @SerializedName("mainContent")
    val mainContent: MainContent,
    @SerializedName("mainVisual")
    val mainVisual: MainVisual,
    @SerializedName("primary")
    val primary: List<Primary>,
    @SerializedName("secondary")
    val secondary: List<Secondary>,
    @SerializedName("tertiary")
    val tertiary: List<Any>
)