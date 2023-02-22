package com.solia.quizapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solia.quizapp.databinding.WellcomeScreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : WellcomeScreenBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = WellcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.mainActivityToolbar)

    }

    private fun createFirstFragment(){
        val fragment = NameInputFragment.newInstance(
            userNum = 1,
            userName = "new one"
        )

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, fragment)
            .commit()
    }

    fun getScreensCount() : Int = supportFragmentManager.backStackEntryCount + 1
}