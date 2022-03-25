package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class unocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unocoln)
    }

    fun regresar1(view: View) {
        finish()
    }

    fun sig1(view: View) {
        var intent = Intent(this, doscoln::class.java)
        startActivity(intent)
    }

    fun clik1(view: View) {
        val parent = findViewById<Button>(R.id.audioc1)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.rojon)
            mp.start()
        }
    }

}