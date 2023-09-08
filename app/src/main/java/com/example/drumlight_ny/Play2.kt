package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Play2Binding

class Play2 : AppCompatActivity(){
    private lateinit var binding: Play2Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Play2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, Play1::class.java)
            startActivity(intent)
        }

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Play3::class.java)
            startActivity(intent)
        }
    }
}