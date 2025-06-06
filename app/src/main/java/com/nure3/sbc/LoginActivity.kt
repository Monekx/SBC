package com.nure3.sbc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nure3.sbc.MainActivity
import com.nure3.sbc.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            // Здесь реализуй проверку логина, например:
            val email = binding.emailEdit.text.toString()
            val password = binding.passwordEdit.text.toString()

            if (email == "test@example.com" && password == "1234") {
                try {// Логин успешен, запускаем MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } catch(e: Exception) {
                    println(e)
                }
                // Закрываем LoginActivity, чтобы по назад не вернуться
            } else {
                // Покажи ошибку (например, Toast)
            }
        }
    }
}
