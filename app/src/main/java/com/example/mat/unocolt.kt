package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class unocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unocolt)
    }

    fun btntc11(view: View) {
        finish()
    }
    fun btnts11(view: View) {
        var intent = Intent(this, doscolt::class.java)
        startActivity(intent)
    }
    fun audio11(view: View) {}
}