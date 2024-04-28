package com.example.app2.navegandoemociones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app2.R

class navegandoEmocionesInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegando_emociones_inicio)

        val btnNEConceptosImportantes = findViewById<Button>(R.id.btnNEConceptosImportantes)
        val btnNEJuegos = findViewById<Button>(R.id.btnNEJuegos)
        val btnNEBiografía = findViewById<Button>(R.id.btnNEBiografía)

        btnNEConceptosImportantes.setOnClickListener {
            val intent = Intent(this, nePresentacion::class.java)
            startActivity(intent)
        }

    }
}