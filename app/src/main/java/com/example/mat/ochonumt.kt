package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ochonumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ochonumt)
    }

    fun bents38(view: View) {
        var intent = Intent(this, nuevenumt::class.java)
        startActivity(intent)
    }
    fun btntc38(view: View) {
        finish()
    }
    fun audio38(view: View) {
        val parent = findViewById<Button>(R.id.audio28)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.ochot)
            mp.start()
        }
    }
}