package com.example.mahjong

import android.content.DialogInterface
import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AlertDialog

class HandCardAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hand_card_acivity)

        //깔끔하게 정리
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        val card_1 = findViewById<ToggleButton>(R.id.cardbtn1)
        val card_2 = findViewById<ToggleButton>(R.id.cardbtn2)
        val card_3 = findViewById<ToggleButton>(R.id.cardbtn3)
        val card_4 = findViewById<ToggleButton>(R.id.cardbtn4)
        val card_5 = findViewById<ToggleButton>(R.id.cardbtn5)
        val card_6 = findViewById<ToggleButton>(R.id.cardbtn6)
        val card_7 = findViewById<ToggleButton>(R.id.cardbtn7)
        val card_8 = findViewById<ToggleButton>(R.id.cardbtn8)
        val card_9 = findViewById<ToggleButton>(R.id.cardbtn9)
        val switch_1 = findViewById<Switch>(R.id.switch1)
        val switch_2 = findViewById<Switch>(R.id.switch2)
        val switch_3 = findViewById<Switch>(R.id.switch3)
        val switch_4 = findViewById<Switch>(R.id.switch4)
        val switch_5 = findViewById<Switch>(R.id.switch5)
        val switch_6 = findViewById<Switch>(R.id.switch6)
        val switch_7 = findViewById<Switch>(R.id.switch7)
        val switch_8 = findViewById<Switch>(R.id.switch8)
        val switch_9 = findViewById<Switch>(R.id.switch9)

        var count = 1
        val Go_Main : Button = findViewById(R.id.Go_Main)
        Go_Main.setOnClickListener {
            startActivity(Intent(this@HandCardAcivity, MainActivity::class.java))
            count=1
        }

        //삭수패로 바꾸기
        fun changeToSac(){
            card_1.setBackgroundResource(R.mipmap.card_num_sac1)
            card_2.setBackgroundResource(R.mipmap.card_num_sac2)
            card_3.setBackgroundResource(R.mipmap.card_num_sac3)
            card_4.setBackgroundResource(R.mipmap.card_num_sac4)
            card_5.setBackgroundResource(R.mipmap.card_num_sac5)
            card_6.setBackgroundResource(R.mipmap.card_num_sac6)
            card_7.setBackgroundResource(R.mipmap.card_num_sac7)
            card_8.setBackgroundResource(R.mipmap.card_num_sac8)
            card_9.setBackgroundResource(R.mipmap.card_num_sac9)
        }
        //만수패로 바꾸기
        fun changeToMan(){
            card_1.setBackgroundResource(R.mipmap.card_num_man1)
            card_2.setBackgroundResource(R.mipmap.card_num_man2)
            card_3.setBackgroundResource(R.mipmap.card_num_man3)
            card_4.setBackgroundResource(R.mipmap.card_num_man4)
            card_5.setBackgroundResource(R.mipmap.card_num_man5)
            card_6.setBackgroundResource(R.mipmap.card_num_man6)
            card_7.setBackgroundResource(R.mipmap.card_num_man7)
            card_8.setBackgroundResource(R.mipmap.card_num_man8)
            card_9.setBackgroundResource(R.mipmap.card_num_man9)
        }
        //통수패 바꾸기
        fun changeToTon(){
            card_1.setBackgroundResource(R.mipmap.card_num_tong1)
            card_2.setBackgroundResource(R.mipmap.card_num_tong2)
            card_3.setBackgroundResource(R.mipmap.card_num_tong3)
            card_4.setBackgroundResource(R.mipmap.card_num_tong4)
            card_5.setBackgroundResource(R.mipmap.card_num_tong5)
            card_6.setBackgroundResource(R.mipmap.card_num_tong6)
            card_7.setBackgroundResource(R.mipmap.card_num_tong7)
            card_8.setBackgroundResource(R.mipmap.card_num_tong8)
            card_9.setBackgroundResource(R.mipmap.card_num_tong9)
        }
        //토글초기화
        fun resetobj(){
            card_1.isChecked = false
            card_2.isChecked = false
            card_3.isChecked = false
            card_4.isChecked = false
            card_5.isChecked = false
            card_6.isChecked = false
            card_7.isChecked = false
            card_8.isChecked = false
            card_9.isChecked = false
            switch_1.isChecked = false
            switch_2.isChecked = false
            switch_3.isChecked = false
            switch_4.isChecked = false
            switch_5.isChecked = false
            switch_6.isChecked = false
            switch_7.isChecked = false
            switch_8.isChecked = false
            switch_9.isChecked = false
        }

        //next 버튼 실행
        val hint_board = findViewById<TextView>(R.id.hintboard)
        val btn_next = findViewById<Button>(R.id.rule_next)
        val hand_viewer = findViewById<ImageView>(R.id.HandView)
        btn_next.setOnClickListener {
            //hand_viewer.setImageResource(R.drawable.hand_02)
            when(count){
                1->{
                    hand_viewer.setImageResource(R.drawable.hand_02)
                    changeToMan()
                    resetobj()
                    count++
                }
                2->{
                    hand_viewer.setImageResource(R.drawable.hand_03)
                    changeToTon()
                    resetobj()
                    count++
                }
                3->{
                    hand_viewer.setImageResource(R.drawable.hand_04)
                    changeToSac()
                    resetobj()
                    count++
                }
                4->{
                    hand_viewer.setImageResource(R.drawable.hand_05)
                    changeToMan()
                    resetobj()
                    count++
                }
                5->{
                    hand_viewer.setImageResource(R.drawable.hand_06)
                    changeToTon()
                    resetobj()
                    count++
                }
                6->{
                    hand_viewer.setImageResource(R.drawable.hand_07)
                    changeToSac()
                    resetobj()
                    count++
                }
                7->{
                    hand_viewer.setImageResource(R.drawable.hand_08)
                    changeToMan()
                    resetobj()
                    count++
                }
                8->{
                    hand_viewer.setImageResource(R.drawable.hand_09)
                    changeToTon()
                    resetobj()
                    count++
                }
                9->{
                    hand_viewer.setImageResource(R.drawable.hand_10)
                    changeToSac()
                    resetobj()
                    count++
                }
                10->{
                    hand_viewer.setImageResource(R.drawable.hand_11)
                    changeToMan()
                    resetobj()
                    count++
                }
                11->{
                    hand_viewer.setImageResource(R.drawable.hand_12)
                    changeToTon()
                    resetobj()
                    count++
                }
                12->{
                    hand_viewer.setImageResource(R.drawable.hand_13)
                    changeToSac()
                    resetobj()
                    count++
                }
                13->{
                    hand_viewer.setImageResource(R.drawable.hand_14)
                    changeToMan()
                    resetobj()
                    count++
                }
                14-> {
                    hand_viewer.setImageResource(R.drawable.hand_02)
                    changeToTon()
                    resetobj()
                    count++
                }
                15->{
                    startActivity(Intent(this@HandCardAcivity, MainActivity::class.java))
                    count=1
                }
            }
            hint_board.setText(null)
        }

        //토글 선택해서 첵박 표시하기
        card_1.setOnClickListener{
            switch_1.isChecked = switch_1.isChecked xor true
        }
        card_2.setOnClickListener{
            switch_2.isChecked = switch_2.isChecked xor true
        }
        card_3.setOnClickListener{
            switch_3.isChecked = switch_3.isChecked xor true
        }
        card_4.setOnClickListener{
            switch_4.isChecked = switch_4.isChecked xor true
        }
        card_5.setOnClickListener{
            switch_5.isChecked = switch_5.isChecked xor true
        }
        card_6.setOnClickListener{
            switch_6.isChecked = switch_6.isChecked xor true
        }
        card_7.setOnClickListener{
            switch_7.isChecked = switch_7.isChecked xor true
        }
        card_8.setOnClickListener{
            switch_8.isChecked = switch_8.isChecked xor true
        }
        card_9.setOnClickListener{
            switch_9.isChecked = switch_9.isChecked xor true
        }
        //체크선택해서 토글 바꾸기
        switch_1.setOnClickListener{
            card_1.isChecked = card_1.isChecked xor true
        }
        switch_2.setOnClickListener{
            card_2.isChecked = card_2.isChecked xor true
        }
        switch_3.setOnClickListener{
            card_3.isChecked = card_3.isChecked xor true
        }
        switch_4.setOnClickListener{
            card_4.isChecked = card_4.isChecked xor true
        }
        switch_5.setOnClickListener{
            card_5.isChecked = card_5.isChecked xor true
        }
        switch_6.setOnClickListener{
            card_6.isChecked = card_6.isChecked xor true
        }
        switch_7.setOnClickListener{
            card_7.isChecked = card_7.isChecked xor true
        }
        switch_8.setOnClickListener{
            card_8.isChecked = card_8.isChecked xor true
        }
        switch_9.setOnClickListener{
            card_9.isChecked = card_9.isChecked xor true
        }

        //정답확인
        val answer = findViewById<Button>(R.id.answer)
        answer.setOnClickListener{
            when(count){
                1->{
                    if(!card_1.isChecked && !card_2.isChecked && card_3.isChecked && !card_4.isChecked && !card_5.isChecked && !card_6.isChecked && !card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id -> })
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                2->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && card_6.isChecked && !card_7.isChecked && !card_8.isChecked && card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                        .setTitle("정답확인")
                        .setMessage("정답입니다")
                        .setPositiveButton("닫기",
                            DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->  })
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                3->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && card_5.isChecked && !card_6.isChecked && !card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                4->{
                    if(!card_1.isChecked && card_2.isChecked && !card_3.isChecked && !card_4.isChecked && card_5.isChecked && !card_6.isChecked && !card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 3 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                5->{
                    if(card_1.isChecked && !card_2.isChecked && card_3.isChecked && card_4.isChecked && !card_5.isChecked && !card_6.isChecked && !card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 3 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                6->{
                    if(!card_1.isChecked && !card_2.isChecked && card_3.isChecked && !card_4.isChecked && !card_5.isChecked && card_6.isChecked && !card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 3 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                7->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && !card_6.isChecked && card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                8->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && card_5.isChecked && !card_6.isChecked && !card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                9->{
                    if(!card_1.isChecked && card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && !card_6.isChecked && !card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                10->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && card_5.isChecked && !card_6.isChecked && !card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                11->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && !card_6.isChecked && card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                12->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && card_5.isChecked && !card_6.isChecked && !card_7.isChecked && card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                13->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && card_6.isChecked && !card_7.isChecked && !card_8.isChecked && card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 2 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                14->{
                    if(!card_1.isChecked && !card_2.isChecked && !card_3.isChecked && !card_4.isChecked && !card_5.isChecked && card_6.isChecked && !card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
                15->{
                    if(card_1.isChecked && !card_2.isChecked && !card_3.isChecked && card_4.isChecked && !card_5.isChecked && !card_6.isChecked && card_7.isChecked && !card_8.isChecked && !card_9.isChecked){
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("정답입니다")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                        builder.create()
                        builder.show()
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder
                            .setTitle("정답확인")
                            .setMessage("오답입니다.")
                            .setPositiveButton("닫기",
                                DialogInterface.OnClickListener { dialog, id ->})
                            .setNegativeButton("힌트",
                                DialogInterface.OnClickListener { dialog, id ->
                                    hint_board.setText("정답 1 개")
                                })
                        builder.create()
                        builder.show()
                    }
                }
            }

        }
    }
}