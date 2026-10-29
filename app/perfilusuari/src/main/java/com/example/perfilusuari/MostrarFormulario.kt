package com.example.perfilusuari

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MostrarFormulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mostrar_formulario)
        val editName = findViewById<TextView>(R.id.name)
        val name = intent.getStringExtra("NAME")
        editName.setText(name)

        val editBio = findViewById<TextView>(R.id.bio)
        val bio = intent.getStringExtra("BIO")
        editBio.setText(bio)

        val editEmail = findViewById<TextView>(R.id.email)
        val email = intent.getStringExtra("EMAIL")
        editEmail.setText(email)

        val editURL = findViewById<ImageView>(R.id.imageProfile)
        val urlImage = intent.getStringExtra("URL")
        Glide.

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}