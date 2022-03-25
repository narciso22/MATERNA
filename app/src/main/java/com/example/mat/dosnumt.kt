package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dosnumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosnumt)
    }

    fun audio31(view: View) {
        val parent = findViewById<Button>(R.id.audio21)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.dost)
            mp.start()
        }
    }
    fun btntc31(view: View) {
        finish()
    }
    fun btnts31(view: View) {
        var intent = Intent(this, tresnumt::class.java)
        startActivity(intent)
    }
}