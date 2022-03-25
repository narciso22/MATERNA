package com.example.mat

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dieznumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieznumt)
    }


    fun btntc390(view: View) {
        finish()
    }
    fun audio390(view: View) {
        val parent = findViewById<Button>(R.id.audio290)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.diezt)
            mp.start()
        }
    }
}