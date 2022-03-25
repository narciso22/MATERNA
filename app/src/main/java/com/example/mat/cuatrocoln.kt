package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cuatrocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatrocoln)
    }

    fun regresar4(view: View) {
        finish()
    }
    fun sig4(view: View) {
        var intent = Intent(this, cincocoln::class.java)
        startActivity(intent)
    }

    fun clik4(view: View) {
        val parent = findViewById<Button>(R.id.audioc4)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.verden)
            mp.start()
        }
    }
}