package com.example.cbcscreeningtest.presentation.di.news

import com.example.cbcscreeningtest.presentation.MainActivity
import dagger.Subcomponent

@NewsScope
@Subcomponent(modules = [NewsModule::class])
interface NewsSubComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():NewsSubComponent
    }
}