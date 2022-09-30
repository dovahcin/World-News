package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndCountryAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { category, language, country, date, _ ->
    newsRepository.getByCategoryAndLanguageAndCountryAndDate(category, language, country, date)
})