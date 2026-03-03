package com.example.activities_p1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LunasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)

        val btnRegresar = findViewById<Button>(R.id.btnAnterior)

        btnRegresar.setOnClickListener {
            Log.d("CicloDeVida", "Lunas: Finalizando actividad para regresar")
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "Lunas: onStart ejecutado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "Lunas: onDestroy - Memoria liberada correctamente")
    }
}