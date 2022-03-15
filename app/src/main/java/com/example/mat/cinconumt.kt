package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cinconumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinconumt)
    }

    fun audio35(view: View) {}
    fun btntc35(view: View) {
        finish()
    }
    fun btnts35(view: View) {
        var intent = Intent(this, seisnumt::class.java)
        startActivity(intent)
    }
}