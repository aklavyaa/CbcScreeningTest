package com.example.cbcscreeningtest.data.api

import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("aggregate_api/v1/items?lineupSlug=news")
    suspend fun getNewsList():Response<NewsDashboardModel>
}