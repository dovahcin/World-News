package com.example.worldnews.data.remote

import com.example.worldnews.domain.model.News
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/v1/news")
    suspend fun getGeneralNews(): List<News>

    @GET("/v1/news")
    suspend fun getByCategory(@Query("categories") category: String): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndDate(
        @Query("categories") category: String,
        @Query("date") date: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndCountry(
        @Query("categories") category: String,
        @Query("countries") country: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndLanguage(
        @Query("categories") category: String,
        @Query("languages") language: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndLanguageAndDate(
        @Query("categories") category: String,
        @Query("languages") language: String,
        @Query("date") date: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndLanguageAndCountry(
        @Query("categories") category: String,
        @Query("languages") language: String,
        @Query("countries") country: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByCategoryAndLanguageAndCountryAndDate(
        @Query("categories") category: String,
        @Query("languages") language: String,
        @Query("countries") country: String,
        @Query("date") date: String,
    ): List<News>

    @GET("/v1/news")
    suspend fun getByKeywordOnDate(
        @Query("date") date: String,
        @Query("keywords") searchQuery: String
    ): List<News>

}