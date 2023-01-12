package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.tapHereButton)
        button.setOnClickListener{
            Toast.makeText(this, "Hello Android!", Toast.LENGTH_LONG).show() // popup messages on android are toasts!
        }

        Log.d("MainActivity", "***** Hello from main!")
    }
}