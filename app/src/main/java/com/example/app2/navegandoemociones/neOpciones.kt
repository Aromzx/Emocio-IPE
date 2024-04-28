package com.example.app2.navegandoemociones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app2.R

class neOpciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ne_opciones)

        val btnNEEmociones = findViewById<Button>(R.id.btnNEEmociones)

        btnNEEmociones.setOnClickListener {
            val intent = Intent(this, neQueSonLasEmociones::class.java)
            startActivity(intent)
        }
    }
}