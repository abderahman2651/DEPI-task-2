package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Move

class moveRecyclerview : RecyclerView.Adapter<moveRecyclerview.UserViewHolder>() {

    var movelist : ArrayList<Move> = ArrayList()

    // تأكيد لتحديث الـ RecyclerView
    fun setlist(movelist: ArrayList<Move>) {
        this.movelist = movelist
        notifyDataSetChanged() // إعادة تحميل البيانات بعد التحديث
    }

    // الـ ViewHolder الخاص بـ RecyclerView
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var iv_moveimage: ImageView = itemView.findViewById(R.id.movieImage)
        var tv_movename: TextView = itemView.findViewById(R.id.movieName)
        var tv_movedec: TextView = itemView.findViewById(R.id.movieDescription)
        var tv_movedetails: TextView = itemView.findViewById(R.id.movieDetails)
        var tv_movepublish: TextView = itemView.findViewById(R.id.publishDate)
        var tv_movenrate: TextView = itemView.findViewById(R.id.rate)

        // ربط البيانات من الكائن بالـ View
        fun bind(move: Move) {
            iv_moveimage.setImageResource(move.imageid)
            tv_movename.text = move.movename
            tv_movedec.text = move.movedesc
            tv_movedetails.text = move.moviedetails
            tv_movepublish.text = move.movepublishdate
            tv_movenrate.text = move.moverate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return UserViewHolder(view) // إرجاع الـ ViewHolder
    }

    override fun getItemCount(): Int {
        return movelist.size // عدد العناصر في القائمة
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val move: Move = movelist[position]
        holder.bind(move) // ربط البيانات بالـ ViewHolder
    }
}
