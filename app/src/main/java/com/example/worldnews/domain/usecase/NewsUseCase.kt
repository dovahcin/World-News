package com.example.worldnews.domain.usecase

import com.example.worldnews.common.Resource
import com.example.worldnews.domain.model.News
import com.example.worldnews.domain.model.NewsAttendants
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

open class NewsUseCase @Inject constructor(
    private val news: suspend (
        NewsAttendants
    ) -> List<News>,
) {
    open suspend operator fun invoke(
        newsAttendants: NewsAttendants
    ) = flow {
        try {
            emit(Resource.Success(news.invoke(NewsAttendants(newsAttendants.category,
                newsAttendants.language,
                newsAttendants.country,
                newsAttendants.date,
                newsAttendants.keyword))))
        } catch (exception: HttpException) {
            emit(Resource.Error(message = exception.localizedMessage
                ?: "Unexpected error has occurred."))
        } catch (exception: IOException) {
            emit(Resource.Error(message = exception.localizedMessage
                ?: "Looks like we couldn't reach the server at the moment,try again later."))
        }
    }.flowOn(IO)
}