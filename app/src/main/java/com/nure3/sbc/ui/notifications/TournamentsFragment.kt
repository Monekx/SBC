package com.nure3.sbc.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.model.TournamentItem
import com.nure3.sbc.ui.adapter.TournamentAdapter



class TournamentsFragment : Fragment() {

    private val items = listOf(
        TournamentItem(R.drawable.tournament_cs2, "CS2", "2025-06-10 18:00", "https://example.com/t1"),
        TournamentItem(R.drawable.tournament_valorant, "Valorant", "2025-06-12 20:00", "https://example.com/t2"),
        TournamentItem(R.drawable.tournaments_dota, "Dota 2", "2025-06-15 19:30", "https://example.com/t3")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_tournaments, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.tournamentsRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = TournamentAdapter(items)
        return view
    }
}
