package com.example.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    val username: String = "abderahman"
    val password: String = "abdo123abdo"

    lateinit var etd_username: EditText
    lateinit var etd_password: EditText
    lateinit var btn_login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etd_username = findViewById(R.id.edt_username)
        etd_password = findViewById(R.id.edt_password)
        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener {
            if (!etd_username.text.toString().isNullOrEmpty() && !etd_password.text.toString().isNullOrEmpty()) {
                if (etd_username.text.toString() == username && etd_password.text.toString() == password) {
                    Toast.makeText(this, "Login successful", Toast.LENGTH_LONG).show()

                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra("username", etd_username.text.toString())
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid credentials", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_LONG).show()
            }
        }
    }
}
