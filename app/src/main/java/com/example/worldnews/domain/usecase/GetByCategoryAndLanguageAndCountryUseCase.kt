package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndCountryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { category, language, country, _, _ ->
    newsRepository.getByCategoryAndLanguageAndCountry(category, language, country)
})