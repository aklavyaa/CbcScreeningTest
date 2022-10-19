package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Dimension(
    @SerializedName("entities")
    val entities: List<Entity>,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)