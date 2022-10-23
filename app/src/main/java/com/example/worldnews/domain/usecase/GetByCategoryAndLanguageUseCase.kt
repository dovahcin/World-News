package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase({ newsAttendants ->
    newsRepository.getByCategoryAndLanguage(newsAttendants.category, newsAttendants.language)
})