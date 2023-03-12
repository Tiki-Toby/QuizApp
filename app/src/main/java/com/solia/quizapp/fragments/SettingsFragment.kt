package com.solia.quizapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.solia.quizapp.R
import com.solia.quizapp.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)

        binding.settingsBackButton.setOnClickListener { getBackFragment() }

        val languages = resources.getStringArray(R.array.languages)
        val arrayAdapter = ArrayAdapter(requireActivity(), R.layout.dropdown_item, languages)
        val autocompleteTV = binding.spinner1
        autocompleteTV.setAdapter(arrayAdapter)

        return binding.root
    }

    private fun getBackFragment() {
        findNavController().popBackStack()
    }
}