package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class unonumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unonumt)
    }

    fun btnts30(view: View) {
        var intent = Intent(this, dosnumt::class.java)
        startActivity(intent)
    }
    fun btntc30(view: View) {
        finish()
    }
    fun audio30(view: View) {
        val parent = findViewById<Button>(R.id.audio20)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.unot)
            mp.start()
        }
    }
}