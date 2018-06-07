package com.example.napat.slide_view

import retrofit2.Call
import retrofit2.http.GET

interface APIMovie {

    @GET("movie")
    fun getMovie(): Call<Movie>
}