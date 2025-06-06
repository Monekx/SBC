package com.nure3.sbc.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nure3.sbc.R
import com.nure3.sbc.model.StoreItem
import com.nure3.sbc.ui.adapter.StoreAdapter
import android.content.Intent
import com.nure3.sbc.StoreDetailActivity
class ShopFragment : Fragment() {

    private val items = listOf(
        StoreItem("Мишка HyperX Pulsefire", 1299, R.drawable.shopitem1),
        StoreItem("Клавіатура SteelSeries Apex Pro", 4999, R.drawable.shopitem2),
        StoreItem("Гарнітура Logitech G Pro X", 3799, R.drawable.shopitem3),
        StoreItem("Крісло Razer Iskur", 10999, R.drawable.shopitem4),
        StoreItem("Монітор ASUS TUF Gaming 27\"", 7499, R.drawable.shopitem5),
        StoreItem("Килимок MSI Agility GD70", 699, R.drawable.shopitem6),
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_shop, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.storeRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.adapter = StoreAdapter(items) { selectedItem ->
            val intent = Intent(requireContext(), StoreDetailActivity::class.java)
            intent.putExtra("name", selectedItem.title)
            intent.putExtra("price", selectedItem.price)
            intent.putExtra("image", selectedItem.imageResId)
            startActivity(intent)
        }


        return view
    }
}
