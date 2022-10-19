package com.example.cbcscreeningtest.data.model.dashboard


import com.google.gson.annotations.SerializedName

data class Entity(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)