package com.example.perfilusuari

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnNextView = findViewById<Button>(R.id.btnNextView)
        val editName = findViewById<EditText>(R.id.editName)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editBio = findViewById<EditText>(R.id.editBio)
        val editURL = findViewById<EditText>(R.id.editURLimage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnNextView.setOnClickListener {
            val mostrarFormulario = Intent(this, MostrarFormulario::class.java)
            mostrarFormulario.putExtra("NAME", editName.text.toString())
            mostrarFormulario.putExtra("EMAIL", editEmail.text.toString())
            mostrarFormulario.putExtra("BIO", editBio.text.toString())
            mostrarFormulario.putExtra("URL", editURL.text.toString())
            startActivity(mostrarFormulario)
        }
    }
}