package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.PlayEnd2Binding

class PlayEnd2 : AppCompatActivity(){
    private lateinit var binding: PlayEnd2Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = PlayEnd2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, PlayEnd1::class.java)
            startActivity(intent)
        }
    }
}