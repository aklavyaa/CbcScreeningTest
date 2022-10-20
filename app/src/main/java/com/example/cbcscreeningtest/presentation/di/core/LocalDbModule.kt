package com.example.cbcscreeningtest.presentation.di.core

import com.example.cbcscreeningtest.data.db.NewsDao
import com.example.cbcscreeningtest.data.repository.dataImpl.dashboard.NewsLocalDbRepoImpl
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsLocalDbRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDbModule {

    @Singleton
    @Provides
    fun provideNewsLocalDb(newsDao: NewsDao): NewsLocalDbRepo {
        return NewsLocalDbRepoImpl(newsDao)
    }
}