package com.example.cbcscreeningtest.data

import com.example.cbcscreeningtest.data.model.dashboard.requiredData.NewsDashboardModelItem
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsCacheRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsLocalDbRepo
import com.example.cbcscreeningtest.data.repository.dataSource.dashboard.NewsRemoteRepo
import com.example.cbcscreeningtest.domain.NewsRepository

class NewsRepositoryImpl(
    private var remoteRepo: NewsRemoteRepo,
    private var localDbRepo: NewsLocalDbRepo,
    private var cacheRepo: NewsCacheRepo
    ) : NewsRepository {

    suspend fun getNewsFromRemote():NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>{
      var response =  remoteRepo.provideNewsFromRemote()
        var body = response.body()
        if (body!=null && response.isSuccessful){
            localDbRepo.saveNewsToLocalDb(body)
            cacheRepo.saveToCache(body)
        }
        return NetworkResponse.handleApi { response }

    }

    suspend fun getNewsFromDb():NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>>{
        var resutl = localDbRepo.getNewsFromDb()
        if (resutl.isNotEmpty()){
            return NetworkResponse.NetworkResult.Success(resutl)
        } else {
            return getNewsFromRemote()
        }
    }

    suspend fun getNewsFromCache():NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>> {
        var resutl = cacheRepo.getNewsCache()

        if (resutl.isNotEmpty() ){
           return NetworkResponse.NetworkResult.Success(resutl)
        } else {
            return getNewsFromDb()
        }
    }


    override suspend fun getNews(): NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>> {
        return getNewsFromCache()
    }

    override suspend fun updateNews(): NetworkResponse.NetworkResult<ArrayList<NewsDashboardModelItem>> {
       return getNewsFromRemote()


    }
}