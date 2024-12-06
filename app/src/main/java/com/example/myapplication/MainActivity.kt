package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

 class MainActivity : AppCompatActivity() {

     val username : String = "abderahman"
     val password : String = "abdo123abdo"

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
            if(!etd_username.text.toString().isNullOrEmpty() && !etd_password.text.toString().isNullOrEmpty()){
                if (etd_username.text.toString().equals(username) && etd_password.text.toString().equals(password)){
                    Toast.makeText(this , "Login successful" , Toast.LENGTH_LONG).show()

                    var intent:Intent = Intent(this , secondActivity::class.java)
                    intent.putExtra("username" , etd_username.text.toString())
                    startActivity(intent)
                }
            }
        }
    }

//     override fun onClick(v: View?) {
//
//         when(v!!.id){
//             R.id.btn_login -> {
//                 Toast.makeText(this , "Login Button Clicked" , Toast.LENGTH_LONG).show()
//             }
//         }
//
//
//     }

//    fun onClicklogin(view : View){
//        Toast.makeText(this , "Login Button Clicked" , Toast.LENGTH_LONG).show()
//    }
}