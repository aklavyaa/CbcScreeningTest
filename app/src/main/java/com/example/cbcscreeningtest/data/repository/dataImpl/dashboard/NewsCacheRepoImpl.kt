package com.example.cbcscreeningtest.data.repository.dataImpl.dashboard

import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsCacheRepo

class NewsCacheRepoImpl: NewsCacheRepo {
    private var newsList = ArrayList<NewsDashboardModelItem>()

    override fun getNewsCache(): ArrayList<NewsDashboardModelItem> {
        return newsList
    }

    override fun saveToCache(list:ArrayList<NewsDashboardModelItem>) {
        newsList.clear()
        newsList = list
    }
}