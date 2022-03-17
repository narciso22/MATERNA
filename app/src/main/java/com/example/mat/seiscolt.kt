package com.example.mat

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class seiscolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seiscolt)
    }

    fun btntc16(view: View) {
        finish()
    }
    fun audio16(view: View) {
        val parent = findViewById<Button>(R.id.audio6)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.naranja)
            mp.start()
        }
    }
}