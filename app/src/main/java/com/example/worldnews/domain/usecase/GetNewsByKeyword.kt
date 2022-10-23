package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetNewsByKeyword(
    private val newsRepository: NewsRepository
) : NewsUseCase({ newsAttendants ->
    newsRepository.getByKeywordOnDate(newsAttendants.keyword, newsAttendants.date)
})