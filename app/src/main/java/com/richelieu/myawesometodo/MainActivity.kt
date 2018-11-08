package com.richelieu.myawesometodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val input: EditText = findViewById(R.id.input)
        val label: TextView = findViewById(R.id.label)

        button.setOnClickListener {
            label.text = input.text
        }
    }
}
