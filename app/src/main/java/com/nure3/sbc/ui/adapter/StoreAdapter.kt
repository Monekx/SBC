package com.nure3.sbc.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.model.StoreItem

class StoreAdapter(
    private val items: List<StoreItem>,
    private val onItemClick: (StoreItem) -> Unit
) : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {

    class StoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.storeItemImage)
        val name: TextView = itemView.findViewById(R.id.storeItemTitle)
        val price: TextView = itemView.findViewById(R.id.storeItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return StoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.imageResId)
        holder.name.text = item.title
        holder.price.text = "${item.price}₴"
        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }

    override fun getItemCount() = items.size
}
