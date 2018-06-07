package com.example.napat.slide_view

import retrofit2.http.GET
import retrofit2.Call
interface GetAPI {
    @GET ("movie")
    fun getAPI () : Call<Movie>
}