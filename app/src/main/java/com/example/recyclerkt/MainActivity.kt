package com.example.recyclerkt

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val profiles = arrayListOf(
            profiles(R.drawable.man, "홍드로이드",27,"안드로이드 앱 개발"),
            profiles(R.drawable.mowan, "안드로이드", 28, "아이폰 앱 개발자"),
            profiles(R.drawable.man, "김드로이드",27,"리액트 앱 개발"),
            profiles(R.drawable.mowan, "종드로이드", 28, "알고리즘 앱 개발자"),
            profiles(R.drawable.man, "강드로이드",27,"유니티 앱 개발"),
            profiles(R.drawable.mowan, "서드로이드", 28, "그냥 앱 개발자")
        )
        binding.rvprofile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvprofile.setHasFixedSize(true)

        binding.rvprofile.adapter = ProfileAdapter(profiles)
    }
}