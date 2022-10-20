package com.example.cbcscreeningtest.data

import android.content.res.Resources.getSystem
import com.bumptech.glide.load.engine.Resource
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

class NetworkResponse {

    sealed class NetworkResult<T>(
        val data: T? = null,
        val message: String? = null
    ) {

        // We'll wrap our data in this 'Success'
        // class in case of success response from api
        class Success<T>(data: T) : NetworkResult<T>(data = data)

        // We'll pass error message wrapped in this 'Error'
        // class to the UI in case of failure response
        class Error<T>(errorMessage: String) : NetworkResult<T>(message = errorMessage)

        // We'll just pass object of this Loading
        // class, just before making an api call
        class Loading<T> : NetworkResult<T>()
    }
//    sealed class NetworkResult<T : Any> {
//        class Success<T: Any>(val response: T) : NetworkResult<T>()
//
//        class Error<T: Any>(val code: Int, val message: String?) : NetworkResult<T>()
//        class Exception<T: Any>(val e: Throwable) : NetworkResult<T>()
//    }

    companion object{
        suspend fun <T : Any> handleApi(
            execute: suspend () -> Response<T>
        ): NetworkResult<T> {
            return try {
                val response = execute()
                val body = response.body()
                if ( body != null && response.isSuccessful ) {
                    NetworkResult.Success(body)
                } else {
                   NetworkResult.Error(response.errorBody().toString())
                }
            } catch (e:IOException){
                NetworkResult.Error(e.message?: "Something went wrong")

            }
            catch (e: HttpException) {
                NetworkResult.Error(e.message()?: "Something went wrong")
            } catch (e: Throwable) {
                NetworkResult.Error("Something went wrong")
            }
        }

    }

}