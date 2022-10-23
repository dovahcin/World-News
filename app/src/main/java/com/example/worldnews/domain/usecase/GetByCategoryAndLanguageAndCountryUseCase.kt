package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndCountryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { newsAttendants ->
    newsRepository.getByCategoryAndLanguageAndCountry(
        newsAttendants.category, newsAttendants.language, newsAttendants.country
    )
})