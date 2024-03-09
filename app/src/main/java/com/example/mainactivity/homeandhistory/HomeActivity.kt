package com.example.mainactivity.homeandhistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.mainactivity.R
import com.example.mainactivity.R.id.*
import java.util.jar.Attributes.Name

class HomeActivity : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var sex: TextView
    private lateinit var address: TextView
    private lateinit var numberinfo: TextView
    private lateinit var contactPer: TextView
    private lateinit var contactpersonInfo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        name = this.findViewById(nameDisplay)
        sex =this. findViewById(sexDisplay)
        address = this. findViewById(addressDisplay)
        numberinfo =  this. findViewById(personNumDisplay)
        contactPer = this. findViewById(contactPersonDisplay)
        contactpersonInfo = this. findViewById(contactPersonNumInfoDisplay)


        val recievedName= intent.getStringExtra("name")
        val recivedSex = intent.getStringExtra("sex")
        val recivedAddress = intent.getStringExtra("address")
        val recivedNumberInfo = intent.getStringExtra("numberInfo")
        val recivedContactPerson = intent.getStringExtra("ContactPerson")
        val recivedContactPersonNumInfo = intent.getStringExtra("numberContactPerson")

        this.name.text = "name: "+recievedName
        sex.text = "sex:"+recivedSex
        address.text = "address: "+recivedAddress
        numberinfo.text ="numberInfo: "+recivedNumberInfo
        contactPer.text ="ContactPerson: "+recivedContactPerson
        contactpersonInfo.text ="numberContactPerson: "+recivedContactPersonNumInfo



    }
}