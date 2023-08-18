package com.example.drumlight_ny

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import kotlin.math.log

class CustomDialog(context: Context, Interface: CustomDialogInterface) : Dialog(context) {

    private var customDialogInterface: CustomDialogInterface = Interface

    private lateinit var closeButton: ImageButton
    private lateinit var homeworkButton: ToggleButton
    private lateinit var updateButton: ToggleButton
    private lateinit var logoutButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup)

        closeButton = findViewById(R.id.close)
        homeworkButton = findViewById(R.id.onoff0)
        updateButton = findViewById(R.id.onoff1)
        logoutButton = findViewById(R.id.log_out)

        // 배경을 투명하게함
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        closeButton.setOnClickListener{
            dismiss()
        }

        homeworkButton.setOnClickListener{

        }

        updateButton.setOnClickListener{

        }


        logoutButton.setOnClickListener{
            customDialogInterface.onLogoutButtonClicked()
        }

    }


    interface CustomDialogInterface {
        fun onLogoutButtonClicked()
    }

}