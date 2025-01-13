package com.example.gentech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserOnboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_onboard1)

        val nxtbutton = findViewById<Button>(R.id.nxtbutton)
        nxtbutton.setOnClickListener{
            val intent = Intent(this, UserOnBooard2::class.java)
            startActivity(intent)
        }
    }
}

