package com.android.chucknorrisjokesandroidapp.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule (
    private var applicationContext: Context
        ) {

    @Provides
    fun proivdeContext(): Context{
    return applicationContext
    }
}
