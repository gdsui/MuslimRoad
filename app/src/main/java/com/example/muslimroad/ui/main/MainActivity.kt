package com.example.muslimroad.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.muslimroad.R
import com.example.muslimroad.ui.choose.ChooseActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        splashMake()
    }

    private fun splashMake() {
        Handler().postDelayed({
            val intent = Intent(applicationContext, ChooseActivity::class.java)
            startActivity(intent)
        }, 4000)
    }
}