package com.warriorminds.interfazgrafica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.warriorminds.interfazgrafica.layouts.ActividadLinearLayoutVertical
import kotlinx.android.synthetic.main.actividad_principal.*

class ActividadPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_principal)

        botonLinearLayoutVertical.setOnClickListener {
            abrirActividadLinearLayoutVertical()
        }
    }

    private fun abrirActividadLinearLayoutVertical() {
        val intent = Intent(this, ActividadLinearLayoutVertical::class.java)
        startActivity(intent)
    }
}
