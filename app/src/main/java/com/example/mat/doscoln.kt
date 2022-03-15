package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class doscoln : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doscoln)
    }

    fun regresar2(view: View) {
        finish()
    }
    fun sig2(view: View) {
        var intent = Intent(this, trescoln::class.java)
        startActivity(intent)
    }
}