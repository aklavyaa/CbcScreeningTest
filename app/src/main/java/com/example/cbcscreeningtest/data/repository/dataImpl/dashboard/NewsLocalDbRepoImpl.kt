package com.example.cbcscreeningtest.data.repository.dataImpl.dashboard

import com.example.cbcscreeningtest.data.db.NewsDao
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModelItem
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsLocalDbRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsLocalDbRepoImpl(private var newsDao: NewsDao): NewsLocalDbRepo {

    override suspend fun getNewsFromDb(): ArrayList<NewsDashboardModelItem>? {
        return newsDao.getAllNews()
    }

    override suspend fun saveNewsToLocalDb(list: ArrayList<NewsDashboardModelItem>) {
        CoroutineScope(Dispatchers.IO).launch {
            newsDao.saveNewsDao(list)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            newsDao.deleteAllNews()
        }
    }
}