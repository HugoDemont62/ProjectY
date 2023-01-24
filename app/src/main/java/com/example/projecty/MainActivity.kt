package com.example.projecty

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_chargin)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            setContentView(R.layout.activity_main)


            val btnExit: Button = findViewById(R.id.exitBtnId)                                          //Selection du BTN pour exit
            btnExit.setOnClickListener {
                finish()                                                                               // Fermer l'activité
            }
        }, 4000)


    }

}