package com.example.worldnews.di

import com.example.worldnews.BuildConfig
import com.example.worldnews.data.remote.ApiInterceptor
import com.example.worldnews.data.remote.NewsApi
import com.example.worldnews.data.repository.NewsRepositoryImpl
import com.example.worldnews.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn
object AppModule {
    @Provides
    @Singleton
    fun provideNewsApi() : NewsApi =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.API_URL)
            .client(
                OkHttpClient.Builder()
                    .readTimeout(15.toLong(), TimeUnit.SECONDS)
                    .connectTimeout(15.toLong(), TimeUnit.SECONDS)
                    .addInterceptor(ApiInterceptor())
                    .build()
    ).build().create(NewsApi::class.java)

    @Provides
    @Singleton
    fun provideCoinRepository(newsApi: NewsApi): NewsRepository = NewsRepositoryImpl(newsApi)
}