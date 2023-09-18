package com.example.drumlight_ny

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.drumlight_ny.databinding.ActivityPlayBinding


class PlayActivity : AppCompatActivity() {

    lateinit var binding : ActivityPlayBinding
    var videoView:VideoView? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = findViewById<ImageView>(R.id.pic)
        val stop = findViewById<ImageButton>(R.id.stopbutton)
        val play = findViewById<ImageButton>(R.id.playbutton)


        videoView = findViewById(R.id.videoView)
        videoView?.setMediaController(MediaController(this))
        videoView?.setVideoURI(Uri.parse("android.resource://"+packageName + "/"+R.raw.music_1))

        binding.next.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        binding.playbutton.setOnClickListener{
            image.visibility = View.INVISIBLE
            stop.visibility = View.INVISIBLE
            play.visibility = View.INVISIBLE
            videoView?.start()
        }

        binding.plus.setOnClickListener{
            videoView?.setOnPreparedListener{ mediaPlayer ->
                videoView?.seekTo(1)
                mediaPlayer.playbackParams = mediaPlayer.playbackParams.apply {
                    speed += 0.1f
                }
                videoView?.start()
            }
        }

        binding.minus.setOnClickListener{
            videoView?.setOnPreparedListener{ mediaPlayer ->
                videoView?.seekTo(1)
                mediaPlayer.playbackParams = mediaPlayer.playbackParams.apply {
                    speed -= 0.1f
                }
                videoView?.start()
            }
        }

        /*binding.partbutton.setOnClickListener{
            val intent = Intent(applicationContext, RepeatActivity::class.java)
            startActivity(intent)
        }*/


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