package com.example.homework13.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.homework13.R
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvName.text = arguments?.getString("NAME_EXTRA_KEY")
        tvLastname.text = arguments?.getString("LAST_NAME_EXTRA_KEY")
    }
}