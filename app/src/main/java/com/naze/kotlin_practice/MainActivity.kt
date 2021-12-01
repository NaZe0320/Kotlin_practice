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

        var stringList = mutableListOf<String>() //문자열로 된 빈 컬랙션

        //입력
        stringList.add("월")
        stringList.add("월")

        //사용
        Log.d("Collection","stringList에 입력된 두번째 값은 ${stringList.get(1)}입니다.")

        //수정
        stringList.set(1,"수정된 값")

        //삭제
        stringList.removeAt(1)

        //set 중복 X 인 리스트
        //get 없음

        //map<키 값, 값>

        //반복문

        for (index in 1..10) {
            Log.d("For","현재 숫자는 ${index}")
        }//기본 in ..

        val array = arrayOf("JAN","FEB","MAR","APR","MAY","JUN")
        for (index in 0 until array.size) {
            Log.d("For2","현재 월은 ${array.get(index)}")
        }//until 마지막 숫자는 제외



        //step 건너뛰기

        //downto 감소 (for i--) 느낌


    }


}