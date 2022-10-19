package com.example.cbcscreeningtest.data

import com.example.cbcscreeningtest.data.model.dashboard.NewsDashboardModel
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsCacheRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsLocalDbRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import com.example.cbcscreeningtest.domain.NewsRepository

class NewsRepositoryImpl(
    private var remoteRepo: NewsRemoteRepo,
    private var localDbRepo: NewsLocalDbRepo,
    private var cacheRepo: NewsCacheRepo
    ) : NewsRepository {

    suspend fun getNewsFromRemote():NetworkResponse.NetworkResult<NewsDashboardModel>{
      var response =  remoteRepo.provideNewsFromRemote()
        var body = response.body()
        if (body!=null && response.isSuccessful){
            localDbRepo.saveNewsToLocalDb(body)
            cacheRepo.saveToCache(body)
        }
        return NetworkResponse.handleApi { response }

    }

    suspend fun getNewsFromDb():NetworkResponse.NetworkResult<NewsDashboardModel>{
        var resutl = localDbRepo.getNewsFromDb()
        if (resutl != null){
            return NetworkResponse.NetworkResult.Success(resutl as NewsDashboardModel)
        } else {
            return getNewsFromRemote()
        }
    }

    suspend fun getNewsFromCache():NetworkResponse.NetworkResult<NewsDashboardModel> {
        if (cacheRepo.getNewsCache() != null){
           return NetworkResponse.NetworkResult.Success(cacheRepo.getNewsCache() as NewsDashboardModel)
        } else {
            return getNewsFromDb()
        }
    }


    override suspend fun getNews(): NetworkResponse.NetworkResult<NewsDashboardModel> {
        return getNewsFromCache()
    }

    override suspend fun updateNews(): NetworkResponse.NetworkResult<NewsDashboardModel> {
       return getNewsFromRemote()


    }
}