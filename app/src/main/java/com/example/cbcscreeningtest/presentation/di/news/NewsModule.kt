package com.example.cbcscreeningtest.presentation.di.news

import com.example.cbcscreeningtest.domain.GetNewsUseCase
import com.example.cbcscreeningtest.domain.UpdateNewsUseCase
import com.example.cbcscreeningtest.presentation.DashboardViewModeFactory
import dagger.Module
import dagger.Provides

@Module
class NewsModule {

    @NewsScope
    @Provides
    fun provideNewsViewModelFactory(
        getNewsUseCase: GetNewsUseCase,
        updateNewsUseCase: UpdateNewsUseCase
    ):DashboardViewModeFactory{
        return DashboardViewModeFactory(getNewsUseCase,updateNewsUseCase)
    }
}