package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cuatronumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatronumn)
    }

    fun r4(view: View) {
        finish()
    }
    fun s4(view: View) {
        var intent = Intent(this, cinconumn::class.java)
        startActivity(intent)
    }

    fun reprod4(view: View) {}
}