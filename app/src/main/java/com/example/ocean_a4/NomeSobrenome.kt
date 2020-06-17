package com.example.ocean_a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btAtualizar
import kotlinx.android.synthetic.main.activity_nome_sobrenome.*

class NomeSobrenome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nome_sobrenome)

        btAtualizar.setOnClickListener {
            if (etNome.text.isEmpty()) {
                etNome.error = "Campo obrigatório"
            } else {
                if (etSobreNome.text.isEmpty()) {
                    etSobreNome.error = "Campo obrigatório"
                } else {
                    tvInfo.text = etNome.text.toString() + " " + etSobreNome.text.toString()
                    Toast.makeText(this, "Atualizado com sucesso.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btLimpar.setOnClickListener {
            tvInfo.text = "Informação digitada aparecerá aqui."
            etNome.text.clear()
            etSobreNome.text.clear()
        }
    }
}