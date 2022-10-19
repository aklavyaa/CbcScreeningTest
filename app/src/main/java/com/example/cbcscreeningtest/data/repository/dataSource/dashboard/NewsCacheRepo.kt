package com.example.cbcscreeningtest.data.repository.dataSource.dashboard

import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModelItem

interface NewsCacheRepo {
    fun getNewsCache():ArrayList<NewsDashboardModelItem>?
    fun saveToCache(list:ArrayList<NewsDashboardModelItem>)
}