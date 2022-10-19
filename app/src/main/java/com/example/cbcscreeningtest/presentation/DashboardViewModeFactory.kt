package com.example.cbcscreeningtest.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cbcscreeningtest.domain.GetNewsUseCase
import com.example.cbcscreeningtest.domain.UpdateNewsUseCase

class DashboardViewModeFactory(
    private var getNewsUseCase: GetNewsUseCase,
    private var updateNewsUseCase: UpdateNewsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DashBoardViewModel(getNewsUseCase,updateNewsUseCase) as T
    }
}