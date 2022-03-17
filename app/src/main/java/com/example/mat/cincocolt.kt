package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cincocolt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cincocolt)
    }

    fun btntc15(view: View) {
        finish()
    }
    fun btnts15(view: View) {
        var intent = Intent(this, seiscolt::class.java)
        startActivity(intent)
    }
    fun audio15(view: View) {

    }
}