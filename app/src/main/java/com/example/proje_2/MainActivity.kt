package com.example.proje_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edt_name=findViewById<EditText>(R.id.ac_main_edt_name)
        var edt_family=findViewById<EditText>(R.id.ac_main_edt_family)
        var btn_confrim=findViewById<Button>(R.id.ac_main_btn_confrim)

        btn_confrim.setOnClickListener {
            if(edt_name.text.toString().length>0 && edt_family.text.toString().length>0) {
                var intent: Intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("edt_name", edt_name.text.toString())
                intent.putExtra("edt_family",edt_family.text.toString())

                finish()
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"فیلد ها خالی است", Toast.LENGTH_SHORT).show()
            }
        }
    }
}