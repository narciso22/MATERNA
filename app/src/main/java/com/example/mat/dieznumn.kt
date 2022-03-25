package com.example.mat

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dieznumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieznumn)
    }

    fun r10(view: View) {
        finish()
    }
    fun reprod10(view: View) {
        val parent = findViewById<Button>(R.id.rep10)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.diezn)
            mp.start()
        }
    }
}