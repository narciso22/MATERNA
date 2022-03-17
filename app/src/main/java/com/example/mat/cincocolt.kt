package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class cincocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cincocolt)
    }

    fun btntc15(view: View) {
        finish()
    }
    fun btnts15(view: View) {
        var intent = Intent(this, seiscolt::class.java)
        startActivity(intent)
    }
    fun audio15(view: View) {
        val parent = findViewById<Button>(R.id.audio5)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.azul)
            mp.start()
        }
    }
}