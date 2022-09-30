package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( {category, language, _, date, _ ->
    newsRepository.getByCategoryAndLanguageAndDate(category, language, date)
} )