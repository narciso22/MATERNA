package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class dosnumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosnumn)
    }

    fun s2(view: View) {
        var intent = Intent(this, tresnumn::class.java)
        startActivity(intent)
    }
    fun r2(view: View) {
        finish()
    }

    fun reprod2(view: View) {
        val parent = findViewById<Button>(R.id.rep2)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.dosn)
            mp.start()
        }
    }
}