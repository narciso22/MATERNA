package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class doscolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doscolt)
    }

    fun btntc12(view: View) {
        finish()
    }
    fun btnts12(view: View) {
        var intent = Intent(this, trescolt::class.java)
        startActivity(intent)
    }
    fun audio12(view: View) {}
}