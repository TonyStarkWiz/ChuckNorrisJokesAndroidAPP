package com.android.chucknorrisjokesandroidapp.di
import android.app.Application
import com.android.chucknorrisjokesandroidapp.MainActivity
import com.android.chucknorrisjokesandroidapp.fragment_main
import com.android.chucknorrisjokesandroidapp.fragment_never_ending_list
import com.android.chucknorrisjokesandroidapp.fragment_text_input
import dagger.Component

@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface JokesComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(fragmentMain: fragment_main)

    fun inject(fragmentTextInput: fragment_text_input)

    fun inject(fragmentNeverEndingList: fragment_never_ending_list)

}