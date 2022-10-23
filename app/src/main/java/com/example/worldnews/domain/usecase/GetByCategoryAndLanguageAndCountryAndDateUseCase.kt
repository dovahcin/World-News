package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndCountryAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { newsAttendants ->
    newsRepository.getByCategoryAndLanguageAndCountryAndDate(
        newsAttendants.category, newsAttendants.language, newsAttendants.country, newsAttendants.date
    )
})