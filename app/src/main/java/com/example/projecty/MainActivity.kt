package com.example.projecty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.chargin)

            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                setContentView(R.layout.activity_main)
            }, 3000)
        }
}