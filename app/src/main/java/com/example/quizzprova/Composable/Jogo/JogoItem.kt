package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Model.Pais
import com.example.quizzprova.Model.PaisesList

@Composable
fun JogoItem(number: Int) {
    var pais = PaisesList.paises[number]
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Qual é esse país?",
        color = Color.White,
            style = MaterialTheme.typography.h3
        )
        imgJogo(pais)
        criarBotoes(pais)
    }
}