package com.example.cbcscreeningtest.presentation.di.core

import com.example.cbcscreeningtest.data.api.ApiService
import com.example.cbcscreeningtest.data.repository.dataImpl.dashboard.NewsRemoteRepoImpl
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteRepo(apiService: ApiService):NewsRemoteRepo{
        return NewsRemoteRepoImpl(apiService)
    }
}