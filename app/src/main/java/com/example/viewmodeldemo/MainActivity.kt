package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display: TextView = findViewById(R.id.displayView)
        val displayBtn : Button = findViewById(R.id.incrementBtn)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        display.text = viewModel.number.toString()

        displayBtn.setOnClickListener {
            viewModel.addNumber()
            display.text = viewModel.number.toString()

        }
    }
}