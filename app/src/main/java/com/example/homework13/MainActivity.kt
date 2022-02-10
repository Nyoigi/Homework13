package com.example.homework13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework13.common.Navigation.navigateToFragmentFromActivity
import com.example.homework13.ui.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragmentFromActivity(activity = this, fragment = FirstFragment())
    }
}