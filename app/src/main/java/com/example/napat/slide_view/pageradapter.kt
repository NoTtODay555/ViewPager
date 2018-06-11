package com.example.napat.slide_view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.content.ContextCompat.startActivity
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.napat.slide_view.R.id.test1
import java.util.*
import android.support.v4.content.ContextCompat.startActivity



class pageradapter(fm: FragmentManager) : FragmentPagerAdapter (fm) {

    override fun getItem(position: Int): Fragment? {
        return BlankFragment.newInstance(position)
    }
    override fun getCount(): Int {
        return 31
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return ("Tab " + (position + 1))
    }



}
