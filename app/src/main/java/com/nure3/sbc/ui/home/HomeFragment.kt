package com.nure3.sbc.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.nure3.sbc.databinding.FragmentHomeBinding
import com.nure3.sbc.model.News
import com.nure3.sbc.ui.adapter.NewsAdapter
import com.nure3.sbc.R
import android.content.Intent
import com.nure3.sbc.ui.news.NewsDetailActivity




class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // Пример данных для ленты новостей
    private val sampleNews = listOf(
        News("NAVI повертаються на вершину — виграють BLAST Paris 2025!", "Після року без великих трофеїв, NAVI розносять G2 у фіналі BLAST Paris з рахунком 2:0. Новий снайпер SENSEi...", R.drawable.article1),
        News("Valve анонсує CS3: повний редизайн і новий античіт", "Valve офіційно представили Counter-Strike 3, що вийде у відкриту бету восени. Серед нововведень: новий рушій Source 3, рейтингова система з прозорими MMR...", R.drawable.article2),
        News("Легендарна SashaGrey очолить кіберспортивну організацію", "Колишня акторка і стрімерка SashaGrey запускає свою кіберспортивну організацію GreyForce, фокусуючись на жіночих івентах і підтримці молодих талантів...", R.drawable.article3),
        News("Українська команда WOLVES виграє міжнародний турнір з Dota 2", "Новостворений український ростер WOLVES перемагає фаворитів OG та Team Spirit на турнірі Dota Battle Royale 2025. MVP турніру — 17-річний мідер ZERON, що...", R.drawable.article4),
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerNews.layoutManager = LinearLayoutManager(requireContext())

        binding.recyclerNews.adapter = NewsAdapter(sampleNews) { selectedNews ->
            // Клік працює тільки для першої новини
            if (selectedNews.title.contains("NAVI")) {
                val intent = Intent(requireContext(), NewsDetailActivity::class.java)
                startActivity(intent)
            }
        }

        binding.recyclerNews.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
