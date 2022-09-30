package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase( { category, _, _, _, _ ->
    newsRepository.getByCategory(category)
})
