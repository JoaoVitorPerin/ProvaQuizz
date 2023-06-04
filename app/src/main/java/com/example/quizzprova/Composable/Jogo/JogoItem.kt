package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Model.PaisesList

@Composable
fun JogoItem(number: Int) {
    var pais = PaisesList.paises[number]
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        imgJogo(pais)
        criarBotoesResposta(pais)
    }
}