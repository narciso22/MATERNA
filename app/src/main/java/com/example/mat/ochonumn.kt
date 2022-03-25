package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ochonumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ochonumn)
    }

    fun r8(view: View) {
        finish()
    }
    fun s8(view: View) {
        var intent = Intent(this, nuevenumn::class.java)
        startActivity(intent)
    }
    fun reprod8(view: View) {
        val parent = findViewById<Button>(R.id.rep8)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.ochon)
            mp.start()
        }
    }
}