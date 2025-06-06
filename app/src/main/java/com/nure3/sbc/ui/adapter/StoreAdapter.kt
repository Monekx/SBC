package com.nure3.sbc.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.model.StoreItem

class StoreAdapter(private val items: List<StoreItem>) : RecyclerView.Adapter<StoreAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.itemName)
        val price = view.findViewById<TextView>(R.id.itemPrice)
        val image = view.findViewById<ImageView>(R.id.itemImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.name.text = item.name
        holder.price.text = "${item.price}₴"
        holder.image.setImageResource(item.imageResId)
    }

    override fun getItemCount() = items.size
}

