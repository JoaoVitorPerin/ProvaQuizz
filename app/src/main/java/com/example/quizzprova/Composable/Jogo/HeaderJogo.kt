package com.example.quizzprova.Composable.Jogo

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.usuario

@Composable
fun HeaderJogo(){
    Column() {
        Text(
            text = "Qual é esse país?",
            style = MaterialTheme.typography.h3,
            color = Color.White
        )
        Text(
            text = "SCORE: ${score.value}",
            style = MaterialTheme.typography.h5,
            color = Color.White
        )
    }
}
var contador = mutableStateOf(0);
var score = mutableStateOf(0);

fun ChecarRepostas(nomePaisCorreto: String, nomePaisSelecionado: String, context: Context) {
    if (nomePaisCorreto == nomePaisSelecionado) {
        Toast.makeText(context, "Resposta Correta! ${usuario.value}", Toast.LENGTH_SHORT).show()
        contador.value = contador.value + 1
        score.value = score.value + 1
    } else {
        Toast.makeText(context, "Resposta Errada!", Toast.LENGTH_SHORT).show()
        contador.value = contador.value + 1
        score.value = score.value
    }
}