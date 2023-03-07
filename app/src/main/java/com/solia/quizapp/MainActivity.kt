package com.solia.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solia.quizapp.databinding.WellcomeScreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : WellcomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WellcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.mainActivityToolbar)
    }
}