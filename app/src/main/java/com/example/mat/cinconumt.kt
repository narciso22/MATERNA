package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cinconumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinconumt)
    }

    fun audio35(view: View) {
        val parent = findViewById<Button>(R.id.audio25)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.cincot)
            mp.start()
        }
    }
    fun btntc35(view: View) {
        finish()
    }
    fun btnts35(view: View) {
        var intent = Intent(this, seisnumt::class.java)
        startActivity(intent)
    }
}