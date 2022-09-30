package com.example.worldnews.domain.usecase

import com.example.worldnews.domain.repository.NewsRepository

class GetNewsByKeyword(
    private val newsRepository: NewsRepository
) : NewsUseCase({_, _, _, date, keyword ->
    newsRepository.getByKeywordOnDate(keyword, date)
})