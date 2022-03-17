package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cuatrocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatrocolt)
    }

    fun btntc14(view: View) {
        finish()
    }
    fun btnts14(view: View) {
        var intent = Intent(this, cincocolt::class.java)
        startActivity(intent)
    }
    fun audio14(view: View) {
        val parent = findViewById<Button>(R.id.audio4)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.verde)
            mp.start()
        }
    }
}