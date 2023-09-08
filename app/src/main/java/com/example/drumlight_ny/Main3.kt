package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.Main3Binding

class Main3 : AppCompatActivity(){
    private lateinit var binding: Main3Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = Main3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bBtn.setOnClickListener{
            val intent = Intent(applicationContext, Main2::class.java)
            startActivity(intent)
        }
    }
}