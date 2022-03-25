package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class seisnumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seisnumt)
    }

    fun btnts36(view: View) {
        var intent = Intent(this, sietenumt::class.java)
        startActivity(intent)
    }
    fun btntc36(view: View) {
        finish()
    }
    fun audio36(view: View) { val parent = findViewById<Button>(R.id.audio26)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.seist)
            mp.start()
        }}
}