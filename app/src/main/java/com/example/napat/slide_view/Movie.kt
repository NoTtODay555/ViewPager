package com.example.napat.slide_view


data class Movie(
    val results: List<Result>
)

data class Result(
    val title: String,
    val image_url: String,
    val overview: String
)