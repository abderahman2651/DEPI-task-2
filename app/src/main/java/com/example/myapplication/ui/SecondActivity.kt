package com.example.myapplication.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
0
        val username = intent.extras!!.getString("username")

        Toast.makeText(this, "Hello $username", Toast.LENGTH_SHORT).show()

    }
}