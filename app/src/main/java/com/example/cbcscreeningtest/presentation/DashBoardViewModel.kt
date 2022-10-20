package com.example.cbcscreeningtest.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.cbcscreeningtest.data.NetworkResponse
import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.domain.GetNewsUseCase
import com.example.cbcscreeningtest.domain.UpdateNewsUseCase

class DashBoardViewModel(
    private var getNewsUseCase: GetNewsUseCase,
    private var getUpdateNewsUseCase: UpdateNewsUseCase
    ):ViewModel() {



        fun getNews()= liveData<NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>> {
            var result = getNewsUseCase.execute()
            emit(result)
        }

     fun updateNews() = liveData<NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>> {
         var result = getUpdateNewsUseCase.execute()
         emit(result)
     }
}