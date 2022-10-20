package com.example.cbcscreeningtest.data.repository.dataSource.dashboard

import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import retrofit2.Response

interface NewsRemoteRepo {
    suspend fun provideNewsFromRemote():Response<ArrayList<NewsDashboardModelItem>>
}