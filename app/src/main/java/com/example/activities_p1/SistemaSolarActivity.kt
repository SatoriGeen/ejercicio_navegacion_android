package com.example.activities_p1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SistemaSolarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)

        // Aquí demostramos el ciclo de vida
        Log.d("CicloDeVida", "Galaxia: onCreate ejecutado")

        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            // El Intent crea la transición a la siguiente Activity
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "Galaxia: onStart ejecutado")
    }
}