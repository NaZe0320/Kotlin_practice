package com.naze.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.naze.kotlin_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //viewBinding 설정
        binding.btnSay.setOnClickListener { //아이디가 btnSay인 버튼
            binding.textSay.text = "Hello Kotlin!"
        }

        //var 변수명(이름) = 값

        //var 변수명 : 타입
        //변수명 = 값

        var now: Int = 10

        when (now) {
            8 -> {
                Log.d("when","현재 시간은 8시입니다")
            }
            9 -> {
                Log.d("when","현재 시간은 9시입니다")
            }
            else -> {
                Log.d("when","현재 시간은 9시가 아닙니다")
            }
        } //when문

        when (now) {
            8,9 -> {
                Log.d("when2","현재 시간은 8시나 9시입니다")
            }
            else -> {
                Log.d("when2","현재 시간은 9시가 아닙니다")
            }
        } //콤바로 비교값 구분

        var age = 15
        when (age) {
            in 10..19 -> {
                Log.d("when3","10대이다")
            }
            !in 10..19 -> {
                Log.d("when3","10대가 아닙니다")
            }
        } //in으로 범위값

        var currentTime = 6
        when {
            currentTime == 5 -> {
                Log.d("when4","현재 시간은 5시")
            }
            currentTime > 5 -> {
                Log.d("when4", "현재 시간은 5시가 넘었습니다")
            }
            currentTime < 5 -> {
                Log.d("when4", "현재 시간은 5시가 이전입니다.")
            }
        } //파라미터 없는 when

    }

}