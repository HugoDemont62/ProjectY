package com.example.projecty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//ffsfsfsfs
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_chargin)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            setContentView(R.layout.activity_main)

            val btnPlay: Button = findViewById(R.id.playBtnId)//Selection du BTN pour play
            val btnCredits: Button = findViewById(R.id.creditsBtnId)//Selection du BTN pour credits
            val btnExit: Button = findViewById(R.id.exitBtnId)//Selection du BTN pour exit

            btnPlay.setOnClickListener {
                println("Game View")// Call game View
            }

            btnCredits.setOnClickListener {
                setContentView(R.layout.activity_credits)// Call Activity credits
            }

            btnExit.setOnClickListener {
                finish()// Fermer l'activity
            }
        }, 3000)


    }

}