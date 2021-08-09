package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import javax.xml.transform.Result

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add (v: View){
        val num1 = this.findViewById<EditText>(R.id.num1)
        val num2 = this.findViewById<EditText>(R.id.num2)
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val sum = n1 + n2
        result.text = sum.toString()

    }
    fun sub (v: View){
        val num1 = this.findViewById<EditText>(R.id.num1)
        val num2 = this.findViewById<EditText>(R.id.num2)
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val sum = n1 - n2
        result.text = sum.toString()

    }
    fun mul (v: View){
        val num1 = this.findViewById<EditText>(R.id.num1)
        val num2 = this.findViewById<EditText>(R.id.num2)
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val sum = n1 * n2
        result.Text = sum.toString()
    }
    fun div (v: View){
        val num1 = this.findViewById<EditText>(R.id.num1)
        val num2 = this.findViewById<EditText>(R.id.num2)
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val sum = n1 / n2
        result.text = sum.toString()
    }
}