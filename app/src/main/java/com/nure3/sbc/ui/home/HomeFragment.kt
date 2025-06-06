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



class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // Пример данных для ленты новостей
    private val sampleNews = listOf(
        News("s1mpleo перейшов до FaZe Clan!", "Їбать як це потужно!", R.drawable.sample_image),
        News("Команда NaVi розпалася", "Щось десь якось там ну короче пофіг..", R.drawable.sample_image),
        News("Заголовок 3", "Описание новости номер 3", R.drawable.sample_image),
        News("Заголовок 4", "Описание новости номер 4", R.drawable.sample_image),
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
        binding.recyclerNews.adapter = NewsAdapter(sampleNews)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
