package com.example.napat.slide_view

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class pageradapter(fm: FragmentManager) : FragmentPagerAdapter (fm) {


    override fun getItem(position: Int): Fragment? {
        if (position === 0) return fargmantone()
        else if (position === 1) return fragmenttwo()
        else if (position === 2) return fragmantthree()
        else if (position === 3) return fragmantfour()
        return null
    }

    override fun getCount(): Int {
        return 4
    }
}