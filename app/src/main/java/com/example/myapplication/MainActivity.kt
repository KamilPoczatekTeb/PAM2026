package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val myButton = findViewById<Button>(R.id.button2)
        val myTextView = findViewById<TextView>(R.id.welcomeTextView)

        myButton.setOnClickListener {
            println("This button was clicked")
            myTextView.text = "This button was clicked"
            myTextView.textSize = 23.toFloat()
        }

        val goToSecondActivityButton = findViewById<Button>(R.id.button3)
        val goToSecondActivityIntent = Intent(this, SecondActivity::class.java)

        goToSecondActivityButton.setOnClickListener {
            startActivity(goToSecondActivityIntent)
        }



    }
}