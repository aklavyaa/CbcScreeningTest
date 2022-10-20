package com.example.cbcscreeningtest.domain

import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem

interface NewsRepository {
    suspend fun getNews():NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>
    suspend fun updateNews():NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>
}