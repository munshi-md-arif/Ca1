package com.example.toolbar

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    var textView: TextView? = null
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // assigning ID of the toolbar to a variable
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar

        // using toolbar as ActionBar
        setSupportActionBar(toolbar)


        // Display application icon in the toolbar
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.drawable.app_icon)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        // assigning ID of textView2 to a variable
        textView = findViewById<View>(R.id.textView2) as TextView


        // "on click" operations to be performed
        textView!!.setOnClickListener {
            count++
            textView!!.text = "" + count
        }
    }
}

