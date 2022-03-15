package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nuevenumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevenumn)
    }

    fun r9(view: View) {
        finish()
    }
    fun s9(view: View) {
        var intent = Intent(this, dieznumn::class.java)
        startActivity(intent)
    }
    fun reprod9(view: View) {}
}