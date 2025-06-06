package com.nure3.sbc.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.ui.adapter.StoreAdapter
import com.nure3.sbc.model.StoreItem

class ShopFragment : Fragment() {

    private val items = listOf(
        StoreItem("Товар 1", 199, R.drawable.sample_image),
        StoreItem("Товар 2", 299, R.drawable.sample_image),
        StoreItem("Товар 3", 399, R.drawable.sample_image),
        StoreItem("Товар 4", 499, R.drawable.sample_image),
        StoreItem("Товар 5", 599, R.drawable.sample_image),
        StoreItem("Товар 6", 699, R.drawable.sample_image),
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.storeRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        recyclerView.adapter = StoreAdapter(items)

        return view
    }
}
