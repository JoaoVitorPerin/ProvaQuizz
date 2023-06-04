package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.JogoActivity

@Composable
fun HeaderJogo(){
    Column() {
        Text(
            text = "Qual é esse país?",
            style = MaterialTheme.typography.h3,
            color = Color.White
        )
        Text(
            text = "SCORE: ",
            style = MaterialTheme.typography.h5,
            color = Color.White
        )
    }
}