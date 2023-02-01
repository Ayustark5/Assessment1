package com.ayustark.assessment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.ayustark.assessment.R
import com.ayustark.assessment.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {
    lateinit var tabL: TabLayout
    lateinit var pager: ViewPager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        tabL = view.findViewById(R.id.tabs)
        pager = view.findViewById(R.id.viewPager)
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(SubTabFragment(), "For You")
        adapter.addFragment(SubTabFragment(), "Top Charts")
        adapter.addFragment(SubTabFragment(), "Categories")
        adapter.addFragment(SubTabFragment(), "Editor's Choice")
        adapter.addFragment(SubTabFragment(), "Early Access")
        adapter.addFragment(SubTabFragment(), "Family")
        pager.adapter = adapter
        tabL.setupWithViewPager(pager)
        tabL.getTabAt(0)?.setIcon(R.drawable.ic_explore)
        tabL.getTabAt(1)?.setIcon(R.drawable.ic_chart)
        tabL.getTabAt(2)?.setIcon(R.drawable.ic_category)
        tabL.getTabAt(3)?.setIcon(R.drawable.ic_star)
        tabL.getTabAt(4)?.setIcon(R.drawable.ic_lock)
        tabL.getTabAt(5)?.setIcon(R.drawable.ic_emoji)
        return view
    }

}