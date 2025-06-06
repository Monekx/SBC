package com.nure3.sbc.ui.auth

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
                // Логин успешен, запускаем MainActivity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Закрываем LoginActivity, чтобы по назад не вернуться
            } else {
                // Покажи ошибку (например, Toast)
            }
        }
    }
}
