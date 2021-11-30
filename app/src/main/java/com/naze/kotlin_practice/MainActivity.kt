package com.naze.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naze.kotlin_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //viewBinding 설정
        binding.btnSay.setOnClickListener{ //아이디가 btnSay인 버튼
            binding.textSay.text = "Hello Kotlin!"
        }


    }
}