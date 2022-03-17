package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class unocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unocolt)
    }

    fun btntc11(view: View) {
        finish()
    }
    fun btnts11(view: View) {
        var intent = Intent(this, doscolt::class.java)
        startActivity(intent)
    }
    fun audio11(view: View) {
        val parent = findViewById<Button>(R.id.audio1)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.rojo)
            mp.start()
        }
    }
}