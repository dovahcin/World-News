package com.example.worldnews.domain.repository

import com.example.worldnews.domain.model.News

interface NewsRepository {
    suspend fun getGeneralNews(): List<News>
    suspend fun getByCategory(category: String): List<News>
    suspend fun getByCategoryAndDate(category: String, date: String): List<News>
    suspend fun getByCategoryAndCountry(category: String, country: String): List<News>
    suspend fun getByCategoryAndLanguage(category: String, language: String): List<News>

    suspend fun getByCategoryAndLanguageAndDate(
        category: String,
        language: String,
        date: String,
    ): List<News>

    suspend fun getByCategoryAndLanguageAndCountry(
        category: String,
        language: String,
        country: String,
    ): List<News>

    suspend fun getByCategoryAndLanguageAndCountryAndDate(
        category: String,
        language: String,
        country: String,
        date: String,
    ): List<News>

    suspend fun getByKeywordOnDate(date: String, keyword: String): List<News>

}