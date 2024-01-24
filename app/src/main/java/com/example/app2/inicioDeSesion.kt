package com.example.app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox


class inicioDeSesion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_de_sesion)

        val button = findViewById<Button>(R.id.btnCrearcuenta)

        button.setOnClickListener {
            val intent = Intent(this, registro::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.btnIniciarSesion)

        button2.setOnClickListener {
            val intent = Intent(this, alumnoAula::class.java)
            startActivity(intent)
        }

        val cbDocente: CheckBox = findViewById(R.id.cbDocente)
        val btnIniciarSesion: Button = findViewById(R.id.btnIniciarSesion)

        btnIniciarSesion.setOnClickListener {
            val intent: Intent = if (cbDocente.isChecked) {
                Intent(this, docenteAula::class.java)
            } else {
                Intent(this, alumnoAula::class.java)
            }
            startActivity(intent)
        }
    }
}