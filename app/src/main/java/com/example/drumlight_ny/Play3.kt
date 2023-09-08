package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Play3Binding


class Play3 : AppCompatActivity(){
    private lateinit var binding: Play3Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Play3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, Play2::class.java)
            startActivity(intent)
        }

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Play4::class.java)
            startActivity(intent)
        }
    }
}