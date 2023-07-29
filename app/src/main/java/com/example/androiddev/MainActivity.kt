package com.example.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androiddev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            val firstName = binding.etFirstNumber.text.toString()
            val lastName = binding.etSecondNumber.text.toString()
            var result: Int = firstName.toInt()+lastName.toInt()
            binding.tvResult.text = result.toString()
        }
    }
}