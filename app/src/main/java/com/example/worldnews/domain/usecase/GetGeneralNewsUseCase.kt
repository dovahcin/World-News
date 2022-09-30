package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetGeneralNewsUseCase(
    newsRepository: NewsRepository,
) : NewsUseCase( { _, _, _, _, _ ->
    newsRepository.getGeneralNews()
})