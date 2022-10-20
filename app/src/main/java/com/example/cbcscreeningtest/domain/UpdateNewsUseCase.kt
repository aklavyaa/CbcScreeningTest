package com.example.cbcscreeningtest.domain

import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem

class UpdateNewsUseCase(private var newsRepository: NewsRepository) {
    suspend fun execute(): NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>> = newsRepository.updateNews()

}