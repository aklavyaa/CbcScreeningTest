package com.example.cbcscreeningtest.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.example.cbcscreeningtest.data.db.NewsDao
import com.example.cbcscreeningtest.data.db.NewsDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context):NewsDatabase{
        return Room.databaseBuilder(context,NewsDatabase::class.java,"news_client").build()
    }

    @Singleton
    @Provides
    fun provideProfileDao(testDatabase: NewsDatabase):NewsDao{
        return testDatabase.newsDao()
    }

}