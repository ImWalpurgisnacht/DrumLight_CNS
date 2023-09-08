package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Main2Binding

class Main2 : AppCompatActivity(){
    private lateinit var binding: Main2Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Main2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, Main::class.java)
            startActivity(intent)
        }

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Main3::class.java)
            startActivity(intent)
        }
    }
}