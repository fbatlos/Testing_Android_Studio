package com.example.pruebaandroid1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstAppActivity : AppCompatActivity() {
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pulsame = findViewById<Button>(R.id.pulsame)
        val textShow = findViewById<AppCompatEditText>(R.id.container1)

        pulsame.setOnClickListener {
            contador++
            Log.i("Contador","Pulsado")
            textShow.setText(contador.toString())
        }
    }

}