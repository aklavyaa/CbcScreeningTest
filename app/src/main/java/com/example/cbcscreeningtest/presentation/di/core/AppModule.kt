package com.example.cbcscreeningtest.presentation.di.core

import android.content.Context
import com.example.cbcscreeningtest.presentation.di.news.NewsSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [NewsSubComponent::class])
class AppModule(private var context: Context) {
    @Singleton
    @Provides
    fun provideApplicationContext():Context{
        return context.applicationContext
    }
}