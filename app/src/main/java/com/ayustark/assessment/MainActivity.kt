package com.ayustark.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.ayustark.assessment.adapters.ViewPagerAdapter
import com.ayustark.assessment.fragments.*
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabL: TabLayout
    lateinit var pager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabL = findViewById(R.id.tabs)
        pager = findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "HOME")
        adapter.addFragment(GamesFragment(), "GAMES")
        adapter.addFragment(MoviesFragment(), "MOVIES")
        adapter.addFragment(MusicFragment(), "MUSIC")
        adapter.addFragment(BooksFragment(), "BOOKS")
        pager.adapter = adapter
        tabL.setupWithViewPager(pager)

    }
}