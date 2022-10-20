package com.example.cbcscreeningtest.presentation.di.core

import com.example.cbcscreeningtest.data.repository.dataImpl.dashboard.NewsCacheRepoImpl
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsCacheRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheModule {
    @Singleton
    @Provides
    fun provideNewsCacheRepo():NewsCacheRepo{
        return NewsCacheRepoImpl()
    }
}