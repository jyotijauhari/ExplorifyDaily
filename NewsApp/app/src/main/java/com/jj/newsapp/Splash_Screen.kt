package com.jj.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.jj.newsapp.ui.NewsActivity

class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        Handler().postDelayed( {
            startActivity(Intent (this, NewsActivity::class.java))
            finish()
        }, SPLASH_TIME)

    }
}