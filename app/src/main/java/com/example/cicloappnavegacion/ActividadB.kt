package com.example.cicloappnavegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)

    val botonC = findViewById<Button>(R.id.botonC)
    val botonD = findViewById<Button>(R.id.botonD)

        val mensaje = intent.getStringExtra("MENSAJE")
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

    botonC.setOnClickListener {
        var intent = Intent (this, ActividadC::class.java)
        intent.putExtra("MENSAJE", "Hacia Actividad C")
        intent.putExtra("MENSAJEA", mensaje)
        startActivity(intent) }


        botonD.setOnClickListener {
            var intent = Intent (this, ActividadD::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad D")
            startActivity(intent)
        }


    }


}