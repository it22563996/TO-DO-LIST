package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.todolist.presentation.MainActivity

class strtpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strtpage)

        var button1 = findViewById<Button>(R.id.startbtn)
        button1.setOnClickListener{
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
    }
}}