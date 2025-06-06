package com.nure3.sbc.ui.news

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nure3.sbc.databinding.ActivityNewsDetailBinding
import com.nure3.sbc.R

class NewsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newsTitle.text = "NAVI повертаються на вершину — виграють BLAST Paris 2025!"
        binding.newsContent.text = """
            Після року без великих трофеїв, NAVI нарешті здобувають перемогу на BLAST Paris 2025. 
            У грандіозному фіналі вони впевнено переграли G2 з рахунком 2:0, де новий снайпер SENSEi показав феноменальну гру.

            Команду очолив b1t, який став справжнім лідером у клатчевих моментах. Глядачі в залі кричали "NAVI! NAVI!" ще до початку другої карти.

            Команда отримає $500,000 призових, а також перше місце у світовому рейтингу HLTV.

            Очікуємо ще більших досягнень від цієї оновленої команди!
        """.trimIndent()

        binding.newsImage.setImageResource(R.drawable.article1)

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}
