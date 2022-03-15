package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ochonumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ochonumn)
    }

    fun r8(view: View) {
        finish()
    }
    fun s8(view: View) {
        var intent = Intent(this, nuevenumn::class.java)
        startActivity(intent)
    }
    fun reprod8(view: View) {}
}