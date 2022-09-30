package com.example.worldnews.data.remote

import com.example.worldnews.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response


class ApiInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url()
        val requestBuilder = original.newBuilder()
            .url(originalHttpUrl.newBuilder()
                .addQueryParameter("access_key", BuildConfig.ACCESS_KEY)
                .build()
            )
        return chain.proceed(requestBuilder.build())
    }
}
