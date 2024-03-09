package com.example.mainactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mainactivity.homeandhistory.HomeAndHistory

class MainActivity : AppCompatActivity() {

    private lateinit var signupbutton:Button
    private lateinit var loginbutton:Button

    private  lateinit var email:EditText
    private lateinit var  password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // For the Two Buttons
        signupbutton = findViewById(R.id.signupButton)
        loginbutton = findViewById(R.id.loginButton)

        // For the Two Edit Text
        email = findViewById(R.id.emailSignin)
        password = findViewById(R.id.Textpassword)


        // launches the Signup Activity
        signupbutton.setOnClickListener {
            Intent(this,Signup::class.java)
            startActivity(intent)
        }

        // launches The login Activity
        loginbutton.setOnClickListener {
             val intent = Intent(this,HomeAndHistory::class.java)
            startActivity(intent)
        }

        intent
        // Recieves the data from user input to the Edit Text
        intent.getStringExtra("emailKey")

        intent.getStringExtra("passwordKey")

    }
}