package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cincocoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cincocoln)
    }

    fun regresar5(view: View) {
        finish()
    }
    fun sig5(view: View) {
        var intent = Intent(this, seiscoln::class.java)
        startActivity(intent)
    }
}