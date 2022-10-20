package com.example.cbcscreeningtest.data.repository.dataImpl.dashboard

import com.example.cbcscreeningtest.data.api.ApiService
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import retrofit2.Response

class NewsRemoteRepoImpl(private var apiService: ApiService): NewsRemoteRepo {
    override suspend fun provideNewsFromRemote(): Response<ArrayList<NewsDashboardModelItem>> {
       return apiService.getNewsList()
    }
}