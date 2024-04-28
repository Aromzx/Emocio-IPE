package com.example.app2.navegandoemociones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.app2.R

class neQueSonLasEmociones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ne_que_son_las_emociones)

        val imgQueSonLasEmociones = findViewById<ImageView>(R.id.imgQueSonLasEmociones)

        imgQueSonLasEmociones.setOnClickListener {
            val intent = Intent(this, neOpciones::class.java)
            startActivity(intent)
        }
    }
}