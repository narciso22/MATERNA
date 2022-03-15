package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sietenumt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sietenumt)
    }

    fun btntc37(view: View) {
        finish()
    }
    fun bents37(view: View) {
        var intent = Intent(this, ochonumt::class.java)
        startActivity(intent)
    }
    fun audio37(view: View) {}
}