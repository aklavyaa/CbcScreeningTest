package com.example.cbcscreeningtest.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModelItem

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveNewsDao(newsList: ArrayList<NewsDashboardModelItem>)

    @Query("DELETE FROM RECENT_NEWS")
    suspend fun deleteAllNews()

    @Query("SELECT * FROM RECENT_NEWS")
    suspend fun getAllNews():ArrayList<NewsDashboardModelItem>
}