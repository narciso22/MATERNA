package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class tresnumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tresnumt)
    }

    fun btnts33(view: View) {
        var intent = Intent(this, cuatronumt::class.java)
        startActivity(intent)
    }
    fun btntc33(view: View) {
        finish()
    }
    fun audio33(view: View) {
        val parent = findViewById<Button>(R.id.audio23)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.trest)
            mp.start()
        }
    }
}