package com.example.cbcscreeningtest.data.repository.dataSource.dashboard

import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModelItem

interface NewsLocalDbRepo {
    suspend fun getNewsFromDb():ArrayList<NewsDashboardModelItem>?
    suspend fun saveNewsToLocalDb(list:ArrayList<NewsDashboardModelItem>)
    suspend fun clearAll()
}