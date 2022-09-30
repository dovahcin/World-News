package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndLanguageUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase({category, language, _, _, _ ->
    newsRepository.getByCategoryAndLanguage(category, language)
})