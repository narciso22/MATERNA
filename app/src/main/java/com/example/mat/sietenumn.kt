package com.example.mat

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class sietenumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sietenumn)
    }

    fun s7(view: View) {
        var intent = Intent(this, ochonumn::class.java)
        startActivity(intent)
    }
    fun r7(view: View) {
        finish()
    }
    fun reprod7(view: View) {
        val parent = findViewById<Button>(R.id.rep7)
        parent.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.sieten)
            mp.start()
        }
    }
}