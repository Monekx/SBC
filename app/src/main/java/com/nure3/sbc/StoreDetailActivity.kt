package com.nure3.sbc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nure3.sbc.databinding.ActivityStoreDetailBinding

class StoreDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoreDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoreDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val price = intent.getIntExtra("price", 0)
        val image = intent.getIntExtra("image", R.drawable.sample_image)

        binding.itemImage.setImageResource(image)
        binding.itemName.text = name
        binding.itemPrice.text = "$price₴"
        binding.itemDescription.text = "Це детальний опис товару \"$name\". Справжня знахідка для справжніх геймерів."

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}
