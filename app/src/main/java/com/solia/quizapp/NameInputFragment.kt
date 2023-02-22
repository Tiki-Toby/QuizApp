package com.solia.quizapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.solia.quizapp.databinding.FragmentNameInputBinding

class NameInputFragment : Fragment() {
    private lateinit var binding : FragmentNameInputBinding

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentNameInputBinding.inflate(inflater, container, false)

        binding.welcomeText2.text = "Welcome, ${getUserName()}#${getUserNum()}"
        binding.confirmButton2.setOnClickListener { confirmName() }
        binding.backButton.setOnClickListener { getBackFragment() }
        binding.nextButton.setOnClickListener { nextName() }

        return binding.root
    }

    private fun nextName() {

        val isInput : Boolean = binding.inputNameField2.text.toString() == ""
        val isLast : Boolean = getUserNum() == (requireActivity() as MainActivity).getScreensCount()

        if(isInput && isLast) {
            confirmName()
        }
        else if(!isLast) {
            getNextFragment()
        }
    }

    private fun confirmName() {

        val fragment = newInstance(
            userNum = (requireActivity() as MainActivity).getScreensCount() + 1,
            userName = binding.inputNameField2.text.toString()
        )
        parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }

    private fun getNextFragment() = parentFragmentManager.beginTransaction().show(getFragmentByIndex(getUserNum()))
    private fun getBackFragment() = parentFragmentManager.beginTransaction().show(getFragmentByIndex(getUserNum() - 1))

    private fun getFragmentByIndex(index : Int) : Fragment = parentFragmentManager.fragments[index]

    private fun getUserNum() : Int = requireArguments().getInt(ARG_COUNTER_VALUE)

    private fun getUserName() : String = requireArguments().getString(ARG_NAME_VALUE)!!

    companion object {

        @JvmStatic
        private val ARG_COUNTER_VALUE = "ARG_COUNTER_VALUE"

        @JvmStatic
        private val ARG_NAME_VALUE = "ARG_NAME_VALUE"

        @JvmStatic
        fun newInstance(userNum: Int, userName: String): NameInputFragment {
            val args = Bundle().apply {
                putInt(ARG_COUNTER_VALUE, userNum)
                putString(ARG_NAME_VALUE, userName)
            }

            val newFragment = NameInputFragment()
            newFragment.arguments = args

            return newFragment
        }
    }
}