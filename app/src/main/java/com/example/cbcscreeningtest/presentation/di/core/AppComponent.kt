package com.example.cbcscreeningtest.presentation.di.core

import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import com.example.cbcscreeningtest.presentation.di.news.NewsSubComponent
import com.example.cbcscreeningtest.presentation.di.repositoryModule.NewsRepositoryModule
import com.example.cbcscreeningtest.presentation.di.useCaseModule.UseCaseModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    NetModule::class,
    DatabaseModule::class,
    UseCaseModule::class,
    RemoteDataModule::class,
    NewsRepositoryModule::class,
    LocalDbModule::class,
    CacheModule::class
])
 interface AppComponent {

    fun newsSubComponent():NewsSubComponent.Factory
}