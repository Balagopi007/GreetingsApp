package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //defining the step 02 -- declairing views
        val edt1: EditText = findViewById(R.id.edt1)
        val btn = findViewById<Button>(R.id.btn1)
        val result_Txt: TextView = findViewById(R.id.txtview1)


        //declairing the functionalities step 03
        btn.setOnClickListener() {
            val entered_Text = edt1.text

        Toast.makeText(this@MainActivity,"Hi "+entered_Text+" Welcome to IJAP Academy",
        Toast.LENGTH_LONG
            ).show()

            result_Txt.setText(""+incrementcounter())


        }
    }

    fun incrementcounter():Int{
        counter++
        return counter
    }

}