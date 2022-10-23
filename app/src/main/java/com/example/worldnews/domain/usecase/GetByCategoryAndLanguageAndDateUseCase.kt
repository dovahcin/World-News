package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { newsAttendants ->
    newsRepository.getByCategoryAndLanguageAndDate(
        newsAttendants.category,
        newsAttendants.language,
        newsAttendants.date
    )
} )