package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cuatronumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatronumt)
    }

    fun btnts34(view: View) {
        var intent = Intent(this, cinconumt::class.java)
        startActivity(intent)
    }
    fun btntc34(view: View) {
        finish()
    }
    fun audio34(view: View) {}
}