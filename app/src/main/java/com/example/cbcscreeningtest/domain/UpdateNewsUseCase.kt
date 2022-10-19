package com.example.cbcscreeningtest.domain

import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel

class UpdateNewsUseCase(private var newsRepository: NewsRepository) {
    suspend fun execute(): NetworkResponse.NetworkResult<NewsDashboardModel> = newsRepository.updateNews()

}