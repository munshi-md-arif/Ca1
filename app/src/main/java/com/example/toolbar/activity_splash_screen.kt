package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper

class activity_splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen2)


        Handler(Looper.getMainLooper()).postDelayed(
            {
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish() },500)
    }
}



