package com.example.drumlight_ny

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.drumlight_ny.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CustomDialog.CustomDialogInterface {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rv_adapter = findViewById<RecyclerView>(R.id.recycler)
        val songadapter = songAdapter(itemList.itemlist)

        rv_adapter.adapter = songadapter
        rv_adapter.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        binding.setting?.setOnClickListener{ //설정 클릭 이벤트
            val customDialog = CustomDialog(this,this)
            customDialog.show()

        }

        binding.level?.setOnClickListener{
            val intent = Intent(applicationContext, SettingActivity::class.java)
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

    override fun onLogoutButtonClicked() {
        val intent = Intent(applicationContext, StartActivity::class.java)
        startActivity(intent)
    }

    override fun onInternetButtonClicked() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/#inbox?compose=GTvVlcRzCpZkvMjjKbxjjMpGgPJntwhDmTxpWqMQrhjmZjqLvbtkkBbRpVwwBjVfTSgMqLRGhxdWR"))
        startActivity(intent)
    }
}

