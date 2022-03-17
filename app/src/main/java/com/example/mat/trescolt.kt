package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class trescolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trescolt)
    }

    fun audio13(view: View) {
        val parent = findViewById<Button>(R.id.audio3)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.lila)
            mp.start()
        }
    }
    fun btnts13(view: View) {
        var intent = Intent(this, cuatrocolt::class.java)
        startActivity(intent)
    }
    fun btntc13(view: View) {
        finish()
    }
}