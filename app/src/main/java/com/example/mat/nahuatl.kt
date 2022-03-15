package com.example.mat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nahuatl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nahuatl)
    }

    fun regresar(view: View) {
        finish()
    }
    fun abrircol(view: View) {
        var intent = Intent(this, unocoln::class.java)
        startActivity(intent)
    }

    fun pro(view: View) {
        var intent = Intent(this, unopron::class.java)
        startActivity(intent)
    }
    fun abrirnum(view: View) {
        var intent = Intent(this, unonumn::class.java)
        startActivity(intent)
    }
}
