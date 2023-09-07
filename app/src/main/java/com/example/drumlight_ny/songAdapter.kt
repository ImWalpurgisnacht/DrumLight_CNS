package com.example.drumlight_ny

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.drumlight_ny.databinding.ItemRecyclerBinding

class songAdapter(val itemList : List<Data>) :
    RecyclerView.Adapter<songAdapter.songViewHolder>(){

    inner class songViewHolder(val itemBinding: ItemRecyclerBinding)
        : RecyclerView.ViewHolder(itemBinding.root){
            fun bindItem(data: Data){
                itemBinding.title.text=data.title
                itemBinding.bpm.text=data.bpm
                itemBinding.practice.text=data.practice

            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): songViewHolder {
        return songViewHolder(ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: songViewHolder, position: Int) {
        val data = itemList[position]
        holder.bindItem(data)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,GuidelineActivity::class.java)
            ContextCompat.startActivity(holder.itemView.context,intent,null)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}