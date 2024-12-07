package com.example.myapplication.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Move
import com.example.myapplication.ui.adapter.moveRecyclerview

@Suppress("UNREACHABLE_CODE")
class secondActivity : AppCompatActivity() {
    lateinit var rv_showdata : RecyclerView
    var movelist : ArrayList<Move> = ArrayList()
    var username : String?=null

    // تأكيد لإنشاء الـ Adapter زي ما هو في الكود بتاعك
    val moveRecyclerview : moveRecyclerview by lazy {
        moveRecyclerview()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // لو أنت عايز تفعّل الخاصية دي
        setContentView(R.layout.activity_second)

        // استقبال الـ username من الـ Intent
        if(intent != null){
            val username = intent.extras!!.getString("username").toString()
            Toast.makeText(this, "Hello $username", Toast.LENGTH_SHORT).show()
        }

        rv_showdata = findViewById(R.id.rv_showdata)
        rv_showdata.adapter = moveRecyclerview

        // إضافة الأفلام في الـ movelist زي ما هو مكتوب عندك
        movelist.add(Move("Movie Name", "Movie Description goes here...", "2023", "Action, Adventure", "8.5", R.id.movieImage))
        movelist.add(Move("Another Movie", "Another description...", "2022", "Drama, Thriller", "7.8", R.id.movieImage))
        movelist.add(Move("Action Movie", "Exciting action-packed movie!", "2021", "Action", "9.0", R.id.movieImage))

        // هنا مفروض تنادي على setlist عشان تعرض الأفلام في الـ RecyclerView
        moveRecyclerview.setlist(movelist)
    }
}


