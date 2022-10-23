package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndCountryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase({ newsAttendants ->
    newsRepository.getByCategoryAndCountry(newsAttendants.category, newsAttendants.country)
})