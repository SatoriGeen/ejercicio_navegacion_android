package com.example.activities_p1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LunasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "Galaxia: onStart ejecutado")
    }
}