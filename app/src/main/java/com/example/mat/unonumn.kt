package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class unonumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unonumn)

    }

    fun r1(view: View) {
        finish()
    }

    fun s1(view: View) {
        var intent = Intent(this, dosnumn::class.java)
        startActivity(intent)
    }

    fun reprod(view: View) {
        val parent = findViewById<Button>(R.id.rep1)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.numerouno)
            mp.start()
        }
    }
}