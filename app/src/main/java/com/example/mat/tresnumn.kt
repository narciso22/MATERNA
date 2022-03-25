package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class tresnumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tresnumn)
    }

    fun r3(view: View) {
        finish()
    }
    fun s3(view: View) {
        var intent = Intent(this, cuatronumn::class.java)
        startActivity(intent)
    }

    fun reprod3(view: View) {
        val parent = findViewById<Button>(R.id.rep3)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.tresn)
            mp.start()
        }
    }
}