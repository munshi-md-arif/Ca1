package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toolbar.databinding.ActivityMainBinding
import com.example.toolbar.databinding.ActivityScrollBinding

class scroll : AppCompatActivity() {





        private lateinit var binding: ActivityScrollBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityScrollBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)

    }
}



