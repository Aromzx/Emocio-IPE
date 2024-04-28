package com.example.app2.fragmentAlumnoAula

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.app2.R
import com.example.app2.navegandoemociones.navegandoEmocionesInicio


class cursosAlumnoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cursos_alumno, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btncurso1 = view.findViewById<Button>(R.id.curso1)
        val btncurso2 = view.findViewById<Button>(R.id.curso2)
        val btncurso3 = view.findViewById<Button>(R.id.curso3)
        val btncurso4 = view.findViewById<Button>(R.id.curso4)

        btncurso1.setOnClickListener {
            val intent = Intent(requireActivity(), navegandoEmocionesInicio::class.java)
            startActivity(intent)
        }
    }
}