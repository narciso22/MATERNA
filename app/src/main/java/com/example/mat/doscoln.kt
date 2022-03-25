package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class doscoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doscoln)
    }

    fun regresar2(view: View) {
        finish()
    }
    fun sig2(view: View) {
        var intent = Intent(this, trescoln::class.java)
        startActivity(intent)
    }

    fun clik2(view: View) {
        val parent = findViewById<Button>(R.id.audioc2)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.amarillon)
            mp.start()
        }
    }
}