package com.example.cbcscreeningtest.presentation.di.repositoryModule

import com.example.cbcscreeningtest.data.NewsRepositoryImpl
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsCacheRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsLocalDbRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import com.example.cbcscreeningtest.domain.NewsRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NewsRepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        remoteRepo: NewsRemoteRepo,
        localDbRepo: NewsLocalDbRepo,
        cacheRepo: NewsCacheRepo
    ):NewsRepository{
        return NewsRepositoryImpl(remoteRepo,localDbRepo,cacheRepo)
    }
}