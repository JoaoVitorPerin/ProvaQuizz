package com.example.quizzprova.Composable.Jogo

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.usuario

@Composable
fun HeaderJogo(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "QUAL É ESSE PAÍS?",
            style = MaterialTheme.typography.h4,
            color = Color.Yellow
        )
        Text(
            text = "SCORE: ${score.value}",
            style = MaterialTheme.typography.h5,
            color = Color.Yellow
        )
    }
}
var contador = mutableStateOf(0);
var score = mutableStateOf(0);

fun ChecarRepostas(nomePaisCorreto: String, nomePaisSelecionado: String, context: Context) {
    if (nomePaisCorreto == nomePaisSelecionado) {
        contador.value = contador.value + 1
        score.value = score.value + 1
    } else {
        contador.value = contador.value + 1
        score.value = score.value
    }
}