package com.example.cbcscreeningtest.domain

import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModelItem
import retrofit2.Response

interface NewsRepository {
    suspend fun getNews():NetworkResponse.NetworkResult<NewsDashboardModel>
    suspend fun updateNews():NetworkResponse.NetworkResult<NewsDashboardModel>
}