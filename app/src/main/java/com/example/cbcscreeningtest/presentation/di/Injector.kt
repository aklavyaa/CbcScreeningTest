package com.example.cbcscreeningtest.presentation.di

import com.example.cbcscreeningtest.presentation.di.news.NewsSubComponent

interface Injector {
    fun createNewsSubComponent():NewsSubComponent
}