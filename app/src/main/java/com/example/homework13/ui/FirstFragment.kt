package com.example.homework13.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import com.example.homework13.R
import com.example.homework13.common.Navigation.navigateToFragmentFromFragment
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnNavigateToSecondFragment.setOnClickListener {
            validateTextInput(navigateToFragment)
        }
    }

    private val navigateToFragment: () -> Unit = {
        val bundle = Bundle()
        bundle.putString("NAME_EXTRA_KEY", etName.text.toString())
        bundle.putString("LAST_NAME_EXTRA_KEY", etLastName.text.toString())

        val fragment = SecondFragment()
        fragment.arguments = bundle

        navigateToFragmentFromFragment(
            fragmentActivity = requireActivity(),
            fragmentTo = fragment
        )
    }

    private fun validateTextInput(lambda: () -> Unit) {
        if (!etName.text.isNullOrBlank() && !etLastName.text.isNullOrBlank()) {
            lambda()
        } else {
            Toast.makeText(requireContext(), "Ваши поля не соответствуют требованиям",
                Toast.LENGTH_SHORT).show()
        }
    }
}