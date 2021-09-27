package com.example.muslimroad.ui.chooseLanguages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muslimroad.R
import com.example.muslimroad.databinding.ActivityChooseLanguagesBinding
import com.example.muslimroad.ui.choose.ChooseActivity

class ChooseLanguagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChooseLanguagesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChooseLanguagesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.backVectorToolbar.setOnClickListener {
            val intent=Intent(applicationContext,ChooseActivity::class.java)
            startActivity(intent)
        }
    }
}