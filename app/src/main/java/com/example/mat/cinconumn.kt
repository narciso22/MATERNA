package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cinconumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinconumn)
    }

    fun reprod5(view: View) {}
    fun s5(view: View) {
        var intent = Intent(this, seisnumn::class.java)
        startActivity(intent)
    }
    fun r5(view: View) {
        finish()
    }
}