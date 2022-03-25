package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cincocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cincocoln)
    }

    fun regresar5(view: View) {
        finish()
    }
    fun sig5(view: View) {
        var intent = Intent(this, seiscoln::class.java)
        startActivity(intent)
    }

    fun clik5(view: View) {
        val parent = findViewById<Button>(R.id.audioc5)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.azuln)
            mp.start()
        }
    }
}