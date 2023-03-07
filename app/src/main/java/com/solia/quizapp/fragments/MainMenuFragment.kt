package com.solia.quizapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.solia.quizapp.R
import com.solia.quizapp.databinding.FragmentMainMenuBinding

class MainMenuFragment : Fragment(R.layout.fragment_main_menu) {
    private lateinit var binding : FragmentMainMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainMenuBinding.inflate(inflater, container, false)

        binding.mainMenuSettingsButton.setOnClickListener { setSettingsFragment() }
        binding.mainMenuExitButton.setOnClickListener { exitFromApp() }

        return binding.root
    }

    fun setSettingsFragment() {
        val action = MainMenuFragmentDirections.actionMainMenuFragmentToSettingsFragment2()
        findNavController().navigate(action)
    }

    fun exitFromApp() {
        requireActivity().onBackPressed()
    }
}