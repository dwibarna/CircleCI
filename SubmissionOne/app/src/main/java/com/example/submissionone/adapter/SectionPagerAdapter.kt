package com.example.submissionone.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.submissionone.view.fragment.FollowersFragment
import com.example.submissionone.view.fragment.FollowingFragment

class SectionPagerAdapter(activity: AppCompatActivity,bundle: Bundle):FragmentStateAdapter(activity) {
    private var mBundle:Bundle = bundle

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment:Fragment? = null
        when(position){
            0 -> fragment = FollowersFragment()
            1 -> fragment = FollowingFragment()
        }
        fragment?.arguments = this.mBundle
        return fragment as Fragment
    }
}