package com.example.yohan.currency_converter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tex = findViewById(R.id.number)as EditText
        val Converter = findViewById(R.id.Converter) as Button
        Converter.setOnClickListener{

            var DoubleText : String  = tex.text.toString()
            var Text : Double = DoubleText.toDouble() * 159.39

           Toast.makeText(this, "Rs "+Text.toString(),Toast.LENGTH_LONG).show()

        }
    }
}
