package com.miu.mdp.assignment2

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.miu.mdp.assignment2.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val random = Random()
        val randomColor: () -> Int =
            { Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)) }
        binding.tvSetBackground.setOnClickListener {
            binding.root.setBackgroundColor(randomColor.invoke())
        }
        binding.ibLogo.setOnClickListener {
            it.setBackgroundColor(randomColor.invoke())
        }
    }
}