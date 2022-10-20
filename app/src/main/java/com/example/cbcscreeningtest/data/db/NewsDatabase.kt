package com.example.cbcscreeningtest.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem

@Database(entities = [NewsDashboardModelItem::class], version = 1, exportSchema = false)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao

}