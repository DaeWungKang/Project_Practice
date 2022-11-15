package com.example.mahjong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.content.pm.ActivityInfo
import android.view.WindowManager
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var actionBar : ActionBar?
        actionBar = supportActionBar
        actionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )

        val start_button : Button= findViewById(R.id.Button_start)
        start_button.setOnClickListener{
            startActivity(Intent(this@MainActivity,HandCardAcivity::class.java))
        }

        val rule_button : Button= findViewById(R.id.Button_Rule)
        rule_button.setOnClickListener{
            startActivity(Intent(this@MainActivity,Rule_Script::class.java))
        }

//        val textView: title = findViewById(R.id.android_text) as title
//        textView.setOnClickListener {
//            textView.text = getString(R.string.name)
//        }
    }
}