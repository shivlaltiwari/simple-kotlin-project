package com.example.datapassingbetwennscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textview = findViewById<TextView>(R.id.textView)
        textview.text = intent.extras?.getString("message")?: "No message from first Screen"

    }
}