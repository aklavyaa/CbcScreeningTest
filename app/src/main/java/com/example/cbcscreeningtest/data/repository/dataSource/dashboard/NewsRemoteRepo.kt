package com.example.cbcscreeningtest.data.repository.dataSource.dashboard

import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import retrofit2.Response

interface NewsRemoteRepo {
    suspend fun provideNewsFromRemote():Response<NewsDashboardModel>
}