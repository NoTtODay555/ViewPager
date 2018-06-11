package com.example.napat.slide_view

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofitadapter {

    fun retrofit (): Retrofit = Retrofit.Builder()
            .baseUrl("https://workshopup.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    fun getapi() = retrofit().create(GetAPI::class.java)
}