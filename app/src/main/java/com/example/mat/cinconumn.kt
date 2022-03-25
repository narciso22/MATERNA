package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cinconumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinconumn)
    }

    fun reprod5(view: View) {
        val parent = findViewById<Button>(R.id.rep5)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.cincon)
            mp.start()
        }
    }
    fun s5(view: View) {
        var intent = Intent(this, seisnumn::class.java)
        startActivity(intent)
    }
    fun r5(view: View) {
        finish()
    }
}