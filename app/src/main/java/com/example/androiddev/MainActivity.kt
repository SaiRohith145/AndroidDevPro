package com.example.androiddev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import androidx.core.view.isVisible
import com.example.androiddev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOrder.setOnClickListener{
            val checkedItemId = binding.rgBiryani.checkedRadioButtonId
            val item = findViewById<RadioButton>(checkedItemId)
            val curd = binding.cbCurd.isChecked
            val sweet = binding.cbSweet.isChecked
            val onions = binding.cbOnions.isChecked
            val orderString: String = "Your Order : \n" +
                    "${item.text} Biryani" +
                    (if(curd) "\nCurd" else "") +
                    (if(sweet) "\nSweet" else "") +
                    (if(onions) "\nOnions" else "")
            binding.tvOrderDetails.text = orderString
        }
    }
}