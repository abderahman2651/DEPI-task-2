package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.move

class moveRecyclerview : RecyclerView.Adapter<moveRecyclerview.UserViewHolder>() {

    var movelist : ArrayList<move> = ArrayList()

    fun setlist (movelist : ArrayList<move>){

        this.movelist = movelist
        notifyDataSetChanged()
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var iv_moveimage:ImageView = itemView.findViewById(R.id.movieImage)
        var tv_movename: TextView = itemView.findViewById(R.id.movieName)
        var tv_movedec: TextView = itemView.findViewById(R.id.movieDescription)
        var tv_movedetails: TextView = itemView.findViewById(R.id.movieDetails)
        var tv_movepublish: TextView = itemView.findViewById(R.id.publishDate)
        var tv_movenrate: TextView = itemView.findViewById(R.id.rate)

        fun bind(move: move){

            iv_moveimage.setImageResource(move.imageid)
            tv_movename.text = move.movename
            tv_movedec.text= move.movedesc
            tv_movedetails.text = move.moviedetails
            tv_movepublish.text=move.movepublishdate
            tv_movenrate.text=move.moverate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return UserViewHolder(view)


    }

    override fun getItemCount(): Int {
        return movelist.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var move : move = movelist.get(position)
        holder.bind(move)
    }
}