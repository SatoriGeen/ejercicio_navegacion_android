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

        val btnAnterior = findViewById<Button>(R.id.buttonAnterior)

        // 2. Le asignamos la acción de regresar
        btnAnterior.setOnClickListener {
            Log.d("CicloDeVida", "Planetas: Regresando a la Vía Láctea...")
            finish() // Cierra esta Activity y libera los recursos
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "Galaxia: onStart ejecutado")
    }
}