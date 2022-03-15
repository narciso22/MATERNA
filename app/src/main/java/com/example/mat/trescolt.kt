package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class trescolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trescolt)
    }

    fun audio13(view: View) {}
    fun btnts13(view: View) {
        var intent = Intent(this, cuatrocolt::class.java)
        startActivity(intent)
    }
    fun btntc13(view: View) {
        finish()
    }
}