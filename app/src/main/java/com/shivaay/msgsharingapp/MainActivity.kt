package com.shivaay.msgsharingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            //Code
            Log.i("MainACtivity","Button was Clicked")
            Toast.makeText( this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }

        btnSendMessageToNextActivity.setOnClickListener {
            val message = etUserMessage.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }
    }
}
