package com.example.app2.navegandoemociones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app2.R

class nePresentacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ne_presentacion)

        val btnNEIniciar = findViewById<Button>(R.id.btnNEIniciar)

        btnNEIniciar.setOnClickListener {
            val intent = Intent(this, neOpciones::class.java)
            startActivity(intent)
        }
    }
}