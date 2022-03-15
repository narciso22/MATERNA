package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tenek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenek)


    }

    fun regresar1(view: View) {
        finish()
    }
    fun abrircol1(view: View) {
        var intent = Intent(this, unocolt::class.java)
        startActivity(intent)
    }
    fun pro1(view: View) {
        var intent = Intent(this, unoprot::class.java)
        startActivity(intent)
    }
    fun abrirnum1(view: View) {
        var intent = Intent(this, unonumt::class.java)
        startActivity(intent)
    }
}