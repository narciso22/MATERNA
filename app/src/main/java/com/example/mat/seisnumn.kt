package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class seisnumn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seisnumn)
    }

    fun r6(view: View) {
        finish()
    }
    fun s6(view: View) {
        var intent = Intent(this, sietenumn::class.java)
        startActivity(intent)
    }
    fun reprod6(view: View) {}
}