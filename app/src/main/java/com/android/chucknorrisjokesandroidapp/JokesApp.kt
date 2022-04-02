package com.android.chucknorrisjokesandroidapp

import android.app.Application
import com.android.chucknorrisjokesandroidapp.di.ApplicationModule
import com.android.chucknorrisjokesandroidapp.di.DaggerJokesComponent
import com.android.chucknorrisjokesandroidapp.di.JokesComponent

class JokesApp : Application() {
    override fun onCreate() {
        super.onCreate()
        jokesComponent = DaggerJokesComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

    }
    companion object{
        lateinit var jokesComponent: JokesComponent
    }
}






















