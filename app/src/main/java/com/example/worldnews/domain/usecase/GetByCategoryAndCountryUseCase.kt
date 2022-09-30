package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetByCategoryAndCountryUseCase(
    private val newsRepository: NewsRepository
) : NewsUseCase({ category, _, country, _, _ ->
    newsRepository.getByCategoryAndCountry(category, country)
})