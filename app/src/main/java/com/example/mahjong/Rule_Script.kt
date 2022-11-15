package com.example.mahjong

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Rule_Script : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rule_script)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )
        var count = 1
        //메인페이지이동버튼
        val gomain_button: Button = findViewById(R.id.Go_Main_RS)
        gomain_button.setOnClickListener {
            startActivity(Intent(this@Rule_Script, MainActivity::class.java))
        }
        //시작버튼
        val startgbtn = findViewById<Button>(R.id.startbtn)
        startgbtn.setOnClickListener{
            startActivity(Intent(this@Rule_Script,HandCardAcivity::class.java))
        }
        //다음 이전 버튼 구현
        val nextbtn = findViewById<Button>(R.id.nextbtn)
        val beforebtn = findViewById<Button>(R.id.beforebtn)
        val rule_image = findViewById<ImageView>(R.id.ruleimage)
        val gametxt = findViewById<TextView>(R.id.gameviewtext)
        nextbtn.setOnClickListener {
            when(count){
                1->{
                    rule_image.setImageResource(R.drawable.ruleimage_01)
                    beforebtn.isEnabled = true
                    beforebtn.visibility = View.VISIBLE
                    gametxt.visibility = View.GONE
                    beforebtn.setBackgroundResource(R.drawable.right_arrow)
                    count++
                }
                2->{
                    rule_image.setImageResource(R.drawable.ruleimage_02)
                    count++
                }
                3->{
                    rule_image.setImageResource(R.drawable.ruleimage)
                    count++
                }
                4->{
                    rule_image.isEnabled = false
                    nextbtn.isEnabled = false
                    startgbtn.isEnabled = true
                    nextbtn.visibility = View.GONE
                    rule_image.visibility = View.GONE
                    startgbtn.setBackgroundResource(R.drawable.startbutton)
                }
            }
        }
        beforebtn.setOnClickListener {
            when(count){
                4->{
                    startgbtn.isEnabled = false
                    rule_image.isEnabled = true
                    nextbtn.isEnabled = true
                    nextbtn.visibility = View.VISIBLE
                    rule_image.visibility = View.VISIBLE
                    rule_image.setImageResource(R.drawable.ruleimage)
                    count--
                }
                3->{
                    rule_image.setImageResource(R.drawable.ruleimage_02)
                    count--
                }
                2->{
                    rule_image.setImageResource(R.drawable.ruleimage_01)
                    count--
                }
                1->{
                    rule_image.setImageResource(R.drawable.game_view)
                    gametxt.visibility = View.VISIBLE
                    beforebtn.isEnabled = false
                    beforebtn.visibility = View.GONE
                }


            }
        }
    }
}