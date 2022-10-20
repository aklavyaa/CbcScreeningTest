package com.example.cbcscreeningtest.presentation.di.useCaseModule

import androidx.room.Update
import com.example.cbcscreeningtest.domain.GetNewsUseCase
import com.example.cbcscreeningtest.domain.NewsRepository
import com.example.cbcscreeningtest.domain.UpdateNewsUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
   fun provideGetNewsUseCase(newsRepository: NewsRepository):GetNewsUseCase{
        return GetNewsUseCase(newsRepository)
    }
    @Singleton
    @Provides
    fun provideUpdateNewsUseCase(newsRepository: NewsRepository):UpdateNewsUseCase{
        return UpdateNewsUseCase(newsRepository)
    }

}