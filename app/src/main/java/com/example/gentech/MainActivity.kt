package com.example.gentech

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            // Start the next activity
            val intent = Intent(this, UserOnboard1::class.java)
            startActivity(intent)
            // Close the current activity (optional)
            finish()
        }, 2000) // 3000 milliseconds = 3 seconds
    }
}