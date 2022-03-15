package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cuatrocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatrocolt)
    }

    fun btntc14(view: View) {
        finish()
    }
    fun btnts14(view: View) {
        var intent = Intent(this, cincocolt::class.java)
        startActivity(intent)
    }
    fun audio14(view: View) {}
}