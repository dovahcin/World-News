package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndDateUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { newsAttendants ->
    newsRepository.getByCategoryAndDate(newsAttendants.category, newsAttendants.date)
})