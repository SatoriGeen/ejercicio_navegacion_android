package com.example.activities_p1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PlanetasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planetas)


        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val intent = android.content.Intent(this, LunasActivity::class.java)
            startActivity(intent)
        }

        val btnAnterior = findViewById<Button>(R.id.buttonAnterior)
        btnAnterior.setOnClickListener {
            Log.d("CicloDeVida", "Planetas: Regresando a Sistema Solar")
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "Planetas: onStart ejecutado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "Planetas: onDestroy - Activity eliminada")
    }
}