package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.PlayEnd1Binding

class PlayEnd1 : AppCompatActivity(){
    private lateinit var binding: PlayEnd1Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = PlayEnd1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, PlayEnd2::class.java)
            startActivity(intent)
        }
    }
}