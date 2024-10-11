package com.example.zavd_44

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.zavd_44.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Ініціалізація binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Створення binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Обробка натискання на текстові поля для зміни кольору
        binding.textViewName.setOnClickListener {
            binding.textViewName.setTextColor(Color.RED)
        }

        binding.textViewGroup.setOnClickListener {
            binding.textViewGroup.setTextColor(Color.BLUE)
        }

        binding.textViewCity.setOnClickListener {
            binding.textViewCity.setTextColor(Color.GREEN)
        }

        // Приховати верхній TextView
        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = View.GONE
        }

        // Показати верхній TextView
        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = View.VISIBLE
        }
    }
}