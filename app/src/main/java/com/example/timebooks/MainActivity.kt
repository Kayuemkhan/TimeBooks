package com.example.timebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var addnotes:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addnotes = findViewById(R.id.addnotes)
        addnotes.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this,NotesActivity::class.java))
        })
    }
}