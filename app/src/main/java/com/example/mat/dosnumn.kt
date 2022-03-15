package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dosnumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dosnumn)
    }

    fun s2(view: View) {
        var intent = Intent(this, tresnumn::class.java)
        startActivity(intent)
    }
    fun r2(view: View) {
        finish()
    }

    fun reprod2(view: View) {}
}