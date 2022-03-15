package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cuatrocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatrocoln)
    }

    fun regresar4(view: View) {
        finish()
    }
    fun sig4(view: View) {
        var intent = Intent(this, cincocoln::class.java)
        startActivity(intent)
    }
}