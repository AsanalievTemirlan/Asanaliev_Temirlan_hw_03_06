package com.example.rv_kotlin_03__6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()
        }
    }
}