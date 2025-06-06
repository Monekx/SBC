package com.nure3.sbc.ui.home
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.nure3.sbc.R

class HomeFragment : Fragment() {

    private lateinit var importantNewsPager: ViewPager2
    private lateinit var newsListView: ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        importantNewsPager = view.findViewById(R.id.importantNewsPager)
        newsListView = view.findViewById(R.id.newsListView)

        val importantNews = listOf(
            "Важная новость: Большое обновление!"
        )

        importantNewsPager.adapter = object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
                val textView = TextView(parent.context).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                    textSize = 24f
                    setPadding(16, 16, 16, 16)
                }
                return object : RecyclerView.ViewHolder(textView) {}
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                (holder.itemView as TextView).text = importantNews[position]
            }

            override fun getItemCount() = importantNews.size
        }

        val newsItems = listOf(
            "Новость 1: Сегодня солнечно",
            "Новость 2: Курсы выросли",
            "Новость 3: Концерт в парке",
            "Новость 4: Спортсмен выиграл",
            "Новость 5: Новый фильм вышел"
        )

        val newsAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, newsItems)
        newsListView.adapter = newsAdapter

        return view
    }
}
