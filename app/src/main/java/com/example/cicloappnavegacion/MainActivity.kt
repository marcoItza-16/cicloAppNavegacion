package com.example.cicloappnavegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton  = findViewById<Button>(R.id.boton)

        boton.setOnClickListener{
    var intent = Intent (this, ActividadB::class.java)
            intent.putExtra("MENSAJE", "Hacia Actividad B")
            startActivity(intent)
        }
    }
}