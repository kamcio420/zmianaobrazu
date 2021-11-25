package com.example.program2511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad)
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.gigachad2)
        }
    }
}