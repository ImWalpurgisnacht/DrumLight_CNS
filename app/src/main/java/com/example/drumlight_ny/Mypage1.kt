package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Mypage1Binding

class Mypage1  : AppCompatActivity(){
    private lateinit var binding: Mypage1Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Mypage1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Mypage2::class.java)
            startActivity(intent)
        }
    }
}