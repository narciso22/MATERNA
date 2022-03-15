package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dosnumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosnumt)
    }

    fun audio31(view: View) {}
    fun btntc31(view: View) {
        finish()
    }
    fun btnts31(view: View) {
        var intent = Intent(this, tresnumt::class.java)
        startActivity(intent)
    }
}