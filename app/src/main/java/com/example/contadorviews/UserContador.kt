package com.example.contadorviews

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserContador : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_contador)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextContador = findViewById<EditText>(R.id.editText)

        val comptador = intent.getIntExtra("NUMBER_COUNTER", 0)
        editTextContador.setText("$comptador")

        val btn4 = findViewById<Button>(R.id.btn4)

        btn4.setOnClickListener {
            val volverHome = Intent(this, MainActivity::class.java)
            volverHome.putExtra("NUMBER_COUNTER", editTextContador.text.toString().toInt())
            startActivity(volverHome)
        }
    }
}