package com.android.chucknorrisjokesandroidapp.di

import android.content.Context
import dagger.Module
import dagger.Proivdes

@ApplicationModule.Module
class ApplicationModule (
    private var applicationContext: Context
        ) {
    annotation class Module

    @Provides
    fun proivdeContext(): Context{
    return applicationContext.
    }
}
