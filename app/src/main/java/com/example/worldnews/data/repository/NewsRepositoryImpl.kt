package com.example.worldnews.data.repository

import com.example.worldnews.data.remote.NewsApi
import com.example.worldnews.domain.model.News
import com.example.worldnews.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: NewsApi
    ) : NewsRepository{
    override suspend fun getGeneralNews(): List<News> = newsApi.getGeneralNews()

    override suspend fun getByCategory(category: String): List<News> =
        newsApi.getByCategory(category)

    override suspend fun getByCategoryAndDate(category: String, date: String): List<News> =
        newsApi.getByCategoryAndDate(category, date)

    override suspend fun getByCategoryAndCountry(category: String, country: String): List<News> =
        newsApi.getByCategoryAndCountry(category, country)

    override suspend fun getByCategoryAndLanguage(category: String, language: String): List<News> =
        newsApi.getByCategoryAndLanguage(category, language)

    override suspend fun getByCategoryAndLanguageAndDate(
        category: String,
        language: String,
        date: String,
    ): List<News> =
        newsApi.getByCategoryAndLanguageAndDate(category, language, date)

    override suspend fun getByCategoryAndLanguageAndCountry(
        category: String,
        language: String,
        country: String,
    ): List<News> =
        newsApi.getByCategoryAndLanguageAndCountry(category, language, country)

    override suspend fun getByCategoryAndLanguageAndCountryAndDate(
        category: String,
        language: String,
        country: String,
        date: String,
    ): List<News> =
        newsApi.getByCategoryAndLanguageAndCountryAndDate(category, language, country, date)

    override suspend fun getByKeywordOnDate(date: String, keyword: String): List<News> =
        newsApi.getByKeywordOnDate(date, keyword)
}