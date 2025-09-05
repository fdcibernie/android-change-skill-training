package com.example.changeskilltraining.oop.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.changeskilltraining.R
import com.example.changeskilltraining.oop.interfaces.IStudentCallback

class WordItemsAdapter : RecyclerView.Adapter<WordItemsAdapter.ItemsVH>() {
    private var list: ArrayList<String>? = null
    private var callback: IStudentCallback? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.word_per_item, parent, false)
        return ItemsVH(view)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: ItemsVH, position: Int) {
        val item = list?.get(position)
        holder.tvItem.text = item
        holder.tvItem.setOnClickListener {
            callback?.onClick(item ?: "Default")
        }
    }

    fun setAdapter(list: ArrayList<String>,callback: IStudentCallback) {
        this.list = list
        this.callback = callback
        notifyDataSetChanged()
    }


    inner class ItemsVH(private val view: View): RecyclerView.ViewHolder(view) {
        val tvItem = view.findViewById<android.widget.TextView>(R.id.tv_item)
    }
}


