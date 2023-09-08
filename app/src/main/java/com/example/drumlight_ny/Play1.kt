package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Play1Binding

class Play1  : AppCompatActivity(){
    private lateinit var binding: Play1Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Play1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Play2::class.java)
            startActivity(intent)
        }
    }
}