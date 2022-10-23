package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { newsAttendants ->
    newsRepository.getByCategory(newsAttendants.category)
})
