package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.MainBinding

class Main : AppCompatActivity(){
    private lateinit var binding: MainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        binding = MainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nBtn.setOnClickListener{
            val intent = Intent(applicationContext, Main2::class.java)
            startActivity(intent)
        }

        val uiOptions = window.decorView.systemUiVisibility
        var newUiOptions: Int = uiOptions
        val isImmersiveModeEnabled = uiOptions or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY == uiOptions
        if (isImmersiveModeEnabled) {
            Log.i("Is on?", "Turning immersive mode mode off. ")
        } else {
            Log.i("Is on?", "Turning immersive mode mode on.")
        }

        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_FULLSCREEN
        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = newUiOptions
    }
}