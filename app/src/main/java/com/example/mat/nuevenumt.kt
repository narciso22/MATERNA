package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nuevenumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevenumt)
    }

    fun bents39(view: View) {
        var intent = Intent(this, dieznumt::class.java)
        startActivity(intent)
    }
    fun btntc39(view: View) {
        finish()
    }
    fun audio39(view: View) {}
}