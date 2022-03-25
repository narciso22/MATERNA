package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class trescoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trescoln)
    }

    fun regresar3(view: View) {
        finish()
    }
    fun sig3(view: View) {
        var intent = Intent(this, cuatrocoln::class.java)
        startActivity(intent)
    }

    fun clik3(view: View) {
        val parent = findViewById<Button>(R.id.audioc3)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.lilan)
            mp.start()
        }
    }
}