package com.nure3.sbc.ui.adapter


import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.model.TournamentItem
import androidx.core.net.toUri

class TournamentAdapter(private val items: List<TournamentItem>) :
    RecyclerView.Adapter<TournamentAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.tournamentImage)
        val name = view.findViewById<TextView>(R.id.tournamentGame)
        val dateTime = view.findViewById<TextView>(R.id.tournamentDateTime)
        val link = view.findViewById<TextView>(R.id.tournamentLink)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tournament, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.imageResId)
        holder.name.text = item.gameName
        holder.dateTime.text = item.dateTime
        holder.link.text = item.link
        holder.link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, item.link.toUri())
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount() = items.size
}
