package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Mypage2Binding

class Mypage2  : AppCompatActivity(){
    private lateinit var binding: Mypage2Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Mypage2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, Mypage1::class.java)
            startActivity(intent)
        }
    }
}