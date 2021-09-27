package com.example.muslimroad.ui.chooseCountry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muslimroad.R
import com.example.muslimroad.databinding.ActivityChooseCountryBinding
import com.example.muslimroad.ui.choose.ChooseActivity

class ChooseCountryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseCountryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChooseCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.imageBackToChooseActivity.setOnClickListener {
            val intent=Intent(applicationContext,ChooseActivity::class.java)
            startActivity(intent)
        }
    }
}