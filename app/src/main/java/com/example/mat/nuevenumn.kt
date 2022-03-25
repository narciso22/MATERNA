package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class nuevenumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevenumn)
    }

    fun r9(view: View) {
        finish()
    }
    fun s9(view: View) {
        var intent = Intent(this, dieznumn::class.java)
        startActivity(intent)
    }
    fun reprod9(view: View) {
        val parent = findViewById<Button>(R.id.rep9)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.nueven)
            mp.start()
        }
    }
}