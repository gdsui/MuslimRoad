package com.example.muslimroad.ui.choose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.muslimroad.R
import com.example.muslimroad.databinding.ActivityChooseBinding
import com.example.muslimroad.ui.chooseCountry.ChooseCountryActivity
import com.example.muslimroad.ui.chooseLanguages.ChooseLanguagesActivity
import com.example.muslimroad.ui.halalMain.HalalMainActivity

class ChooseActivity : AppCompatActivity() {
    private lateinit var chooseBinding: ActivityChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        chooseBinding = ActivityChooseBinding.inflate(layoutInflater)
        setContentView(chooseBinding.root)
        supportActionBar?.hide()
        viewListener()


    }

    private fun viewListener() {

        chooseBinding.tvCountry.setOnClickListener {
            val intent = Intent(applicationContext, ChooseCountryActivity::class.java)
            startActivity(intent)
        }
        chooseBinding.tvLanguage.setOnClickListener {
            val intent = Intent(applicationContext, ChooseLanguagesActivity::class.java)
            startActivity(intent)
        }
        chooseBinding.tvNext.setOnClickListener {
            val intent = Intent(applicationContext, HalalMainActivity::class.java)
            startActivity(intent)
        }
    }
}