package com.example.drumlight_ny

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.ActivityMainBinding
import com.example.drumlight_ny.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {

    lateinit var binding : ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
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
// 몰입 모드를 꼭 적용해야 한다면 아래의 3가지 속성을 모두 적용시켜야 합니다
// 몰입 모드를 꼭 적용해야 한다면 아래의 3가지 속성을 모두 적용시켜야 합니다
        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_FULLSCREEN
        newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = newUiOptions
    }
}