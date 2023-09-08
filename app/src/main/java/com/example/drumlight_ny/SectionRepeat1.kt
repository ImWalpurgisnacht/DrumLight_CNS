package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.SectionRepeat1Binding

class SectionRepeat1 : AppCompatActivity(){
    private lateinit var binding: SectionRepeat1Binding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = SectionRepeat1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, SectionRepeat2::class.java)
            startActivity(intent)
        }
    }
}