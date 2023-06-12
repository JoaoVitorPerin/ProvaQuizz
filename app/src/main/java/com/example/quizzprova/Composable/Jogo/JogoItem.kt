package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.quizzprova.Model.PaisesList

@Composable
fun JogoItem(number: Int) {
    val listaPaises = PaisesList.paises;
    var listaAleatoria = listaPaises.shuffled();
    var pais = listaAleatoria[number];

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        imgJogo(pais)
        criarBotoesResposta(pais)
    }
}