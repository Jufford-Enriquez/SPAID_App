package com.example.mainactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mainactivity.R.id.emailAccount
import com.example.mainactivity.R.id.emailPassword
import com.example.mainactivity.homeandhistory.HomeActivity

class Signup : AppCompatActivity() {

    private lateinit var name:EditText
    private lateinit var sex:EditText
    private lateinit var address:EditText
    private lateinit var numberinfo:EditText
    private lateinit var contactperson:EditText
    private lateinit var contactpersonNoinfo:EditText
    private lateinit var email:EditText
    private lateinit var password:EditText

    private lateinit var createaccount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        name = findViewById(R.id.Name)
        sex = findViewById(R.id.Sex)
        address = findViewById(R.id.Address)
        numberinfo = findViewById(R.id.numberInfo)
        contactperson = findViewById(R.id.contactPerson)
        contactpersonNoinfo = findViewById(R.id.contactPersonInfo)
        createaccount = findViewById(R.id.createAccount)


        // Pass the data to the MainActivity
        email = findViewById(emailAccount)
        password = findViewById(emailPassword)


        // Extract & convert this to string
        email.text.toString()
        password.text.toString()


        // To launch & send the Name, Sex, Address, Number Information, Contact Person
        createaccount.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)

           val enteredName = name.text.toString()
            intent.putExtra("name",enteredName)

            sex.text.toString()
            val enteredSex = sex.text.toString()
            intent.putExtra("sex",enteredSex)

            address.text.toString()
            val enteredAddress = address.text.toString()
            intent.putExtra("address",enteredAddress)

            numberinfo.text.toString()
            val enterednumberInfo = numberinfo.text.toString()
            intent.putExtra("numberInfo",enterednumberInfo)


            contactperson.text.toString()
            val enteredContactperson = contactpersonNoinfo.text.toString()
            intent.putExtra("ContactPerson",enteredContactperson)
            startActivity(intent)

            contactpersonNoinfo.text.toString()
            val enteredNumberInfo = contactpersonNoinfo.text.toString()
            intent.putExtra("numberContactPerson",enteredNumberInfo)

            email.text.toString()
            val enteredEmail = email.text.toString()
            intent.putExtra("email",enteredEmail)

        }

        //for Main Activity
        createaccount.setOnClickListener {
            val enteredEmail = email.text.toString()
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra("emailKey",enteredEmail)


            val enteredPassword = password.text.toString()
            intent.putExtra("passwordKey",enteredPassword)

        }



    }


}
