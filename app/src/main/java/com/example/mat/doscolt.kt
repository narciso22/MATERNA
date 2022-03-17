package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class doscolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doscolt)
    }

    fun btntc12(view: View) {
        finish()
    }
    fun btnts12(view: View) {
        var intent = Intent(this, trescolt::class.java)
        startActivity(intent)
    }
    fun audio12(view: View) {
        val parent = findViewById<Button>(R.id.audio2)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.amarillo)
            mp.start()
        }
    }
}