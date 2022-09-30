package com.example.worldnews.domain.model

import android.content.Context

data class Error(
    val code: String,
    val context: Context,
    val message: String
)

data class Context(
    val date: List<String>
)