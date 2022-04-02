package com.android.chucknorrisjokesandroidapp.di
import com.android.chucknorrisjokesandroidapp.rest.JokeRepositoryImpl
import com.android.chucknorrisjokesandroidapp.rest.JokesRepository
import com.android.chucknorrisjokesandroidapp.rest.Services
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
class  NetworkModule {
    @Provides
    fun providesNetworkService(okHttpClient: OkHttpClient) =
        Retrofit.Builder().baseUrl(Services.baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(Services::class.java)

    @Provides
    fun providesOkHttpClient() =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()

    @Provides
    fun providesJokeRepository(jokeServices: Services): JokesRepository =
        JokeRepositoryImpl(jokeServices)
}

