package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( {category, _, _, date, _ ->
    newsRepository.getByCategoryAndDate(category, date)
})