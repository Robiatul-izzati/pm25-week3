package com.example.assigment2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<EditText>(R.id.inputName)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnHello.setOnClickListener {
            val text = inputName.text.toString().trim()

            if (text.isEmpty()) {
                txtResult.text = "Please enter your name first."
            } else {
                txtResult.text = "Hello, $text"
            }
        }
    }
}