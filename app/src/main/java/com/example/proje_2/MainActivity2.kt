package com.example.proje_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var txt1= findViewById<TextView>(R.id.ac_main2_txt)

        var bundle: Bundle? = intent.extras

        txt1.text =  " سلام" + " " +bundle!!.get("edt_name").toString() +" "+ bundle!!.get("edt_family").toString() + " عزیز به سامانه خوش آمدید"

        Toast.makeText(this ,""+txt1.text.toString(), Toast.LENGTH_SHORT).show()



    }
}