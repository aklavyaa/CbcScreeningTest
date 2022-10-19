package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class ExtattribX(
    @SerializedName("displaycomments")
    val displaycomments: Boolean,
    @SerializedName("hasaudio")
    val hasaudio: Boolean,
    @SerializedName("hasgallery")
    val hasgallery: Boolean,
    @SerializedName("hasvideo")
    val hasvideo: Boolean,
    @SerializedName("olympictags")
    val olympictags: Any,
    @SerializedName("syndicate")
    val syndicate: String,
    @SerializedName("urlslug")
    val urlslug: String,
    @SerializedName("vfsection")
    val vfsection: String
)