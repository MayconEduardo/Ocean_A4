package com.example.ocean_a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAtualizar.setOnClickListener {
            if (etInfo.text.isEmpty()) {
                etInfo.error = "Campo obrigatório"
            } else {
                tvInfo.text = etInfo.text.toString()
            }
        }

        btLimpar.setOnClickListener {
            tvInfo.text = "Informação digitada aparecerá aqui."
            etInfo.text.clear()
        }
    }
}