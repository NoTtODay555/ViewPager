package com.example.napat.slide_view

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = pageradapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.vp_image) as ViewPager
        pager.adapter = adapter

    }

}

