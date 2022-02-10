package com.example.homework13.common

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.homework13.R

object Navigation {

    fun navigateToFragmentFromActivity(
        activity: AppCompatActivity,
        fragment: Fragment
    ){
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    fun navigateToFragmentFromFragment(
        fragmentActivity: FragmentActivity,
        fragmentTo: Fragment
    ) {
        fragmentActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragmentTo)
            .commit()
    }
}