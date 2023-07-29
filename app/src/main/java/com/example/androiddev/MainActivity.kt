package com.example.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import com.example.androiddev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var isVisible:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            if (isVisible){
                isVisible =false
                binding.ivWallp.isVisible = false
            } else {
                isVisible= true
                binding.ivWallp.setImageResource(R.drawable.wallpaper)
                binding.ivWallp.isVisible = true
            }

        }
    }
}