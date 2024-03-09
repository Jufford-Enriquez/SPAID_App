package com.example.mainactivity.homeandhistory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mainactivity.R

class HomeAndHistory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_and_history)


        val homebutton = findViewById<Button>(R.id.homeButton)
        homebutton.setOnClickListener {
           Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.historyButton)
        homebutton.setOnClickListener {
            val intent =  Intent(this,history_Activity::class.java)
            startActivity(intent)

        }

    }
}