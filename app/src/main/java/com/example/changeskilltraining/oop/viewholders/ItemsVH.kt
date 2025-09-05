package com.example.changeskilltraining.oop.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.changeskilltraining.R

class ItemsVH(private val view: View): RecyclerView.ViewHolder(view) {
    val tvItem = view.findViewById<android.widget.TextView>(R.id.tv_item)
}