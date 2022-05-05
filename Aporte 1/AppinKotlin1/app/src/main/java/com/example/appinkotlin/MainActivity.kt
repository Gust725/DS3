package com.example.appinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculadora.setOnClickListener {
            val intent0:Intent = Intent(this, Calculadora::class.java)
            startActivity(intent0)
        }

        btnCronometro.setOnClickListener{
            val intent1:Intent = Intent(this, Cronometro::class.java)
            startActivity(intent1)
        }
        btnSalir.setOnClickListener {
            finish()
        }
    }

}