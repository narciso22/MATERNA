package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cuatronumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatronumt)
    }

    fun btnts34(view: View) {
        var intent = Intent(this, cinconumt::class.java)
        startActivity(intent)
    }
    fun btntc34(view: View) {
        finish()
    }
    fun audio34(view: View) {
        val parent = findViewById<Button>(R.id.audio24)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.cuatrot)
            mp.start()
        }
    }
}