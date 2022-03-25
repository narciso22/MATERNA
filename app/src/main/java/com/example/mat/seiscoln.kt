package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class seiscoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seiscoln)
    }

    fun regresar6(view: View) {
        finish()
    }

    fun clik6(view: View) {
        val parent = findViewById<Button>(R.id.audioc6)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.anaranjadon)
            mp.start()
        }
    }

}