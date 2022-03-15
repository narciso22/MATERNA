package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class unocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unocoln)
    }

    fun regresar1(view: View) {
        finish()
    }

    fun sig1(view: View) {
        var intent = Intent(this, doscoln::class.java)
        startActivity(intent)
    }

}