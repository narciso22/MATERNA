package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class trescoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trescoln)
    }

    fun regresar3(view: View) {
        finish()
    }
    fun sig3(view: View) {
        var intent = Intent(this, cuatrocoln::class.java)
        startActivity(intent)
    }
}