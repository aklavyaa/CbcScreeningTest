package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Extattrib(
    @SerializedName("captionUrl")
    val captionUrl: String,
    @SerializedName("displaycomments")
    val displaycomments: Boolean,
    @SerializedName("guid")
    val guid: String,
    @SerializedName("hasaudio")
    val hasaudio: Boolean,
    @SerializedName("hasgallery")
    val hasgallery: Boolean,
    @SerializedName("hasvideo")
    val hasvideo: Boolean,
    @SerializedName("liveondemand")
    val liveondemand: String,
    @SerializedName("mediaid")
    val mediaid: String,
    @SerializedName("mediatype")
    val mediatype: String,
    @SerializedName("olympictags")
    val olympictags: Any,
    @SerializedName("releaseid")
    val releaseid: String,
    @SerializedName("runtime")
    val runtime: Double,
    @SerializedName("syndicate")
    val syndicate: String,
    @SerializedName("urlslug")
    val urlslug: String,
    @SerializedName("vfsection")
    val vfsection: String,
    @SerializedName("yospaceid")
    val yospaceid: String
)