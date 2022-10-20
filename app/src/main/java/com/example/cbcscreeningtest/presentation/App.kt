package com.example.cbcscreeningtest.presentation

import android.app.Application
import com.example.cbcscreeningtest.presentation.di.Injector
import com.example.cbcscreeningtest.presentation.di.core.*
import com.example.cbcscreeningtest.presentation.di.news.NewsSubComponent
import com.example.cbcscreeningtest.presentation.di.repositoryModule.NewsRepositoryModule

class App : Application(),Injector {
private lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
      appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule("https://www.cbc.ca/"))
            .newsRepositoryModule(NewsRepositoryModule())
            .build()
    }
    override fun createNewsSubComponent(): NewsSubComponent {
        return appComponent.newsSubComponent().create()
    }
}