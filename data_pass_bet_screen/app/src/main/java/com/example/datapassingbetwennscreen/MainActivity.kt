package com.example.datapassingbetwennscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendData(v: View){
        val name = findViewById<EditText>(R.id.name).text.toString()

       val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("message",name)
        startActivity(intent)

    }
}