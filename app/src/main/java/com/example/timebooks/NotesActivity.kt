package com.example.timebooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotesActivity : AppCompatActivity() {
    lateinit var fab_icon:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        fab_icon = findViewById(R.id.fab_icon)
        fab_icon.setOnClickListener(View.OnClickListener {
            var alertDialog: AlertDialog.Builder = AlertDialog.Builder(this)
        })
    }
}