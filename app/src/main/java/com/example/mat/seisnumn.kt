package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class seisnumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seisnumn)
    }

    fun r6(view: View) {
        finish()
    }
    fun s6(view: View) {
        var intent = Intent(this, sietenumn::class.java)
        startActivity(intent)
    }
    fun reprod6(view: View) {
        val parent = findViewById<Button>(R.id.rep6)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.seisn)
            mp.start()
        }
    }
}