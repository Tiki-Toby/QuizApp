package com.solia.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solia.quizapp.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.mainActivityToolbar)
    }
}