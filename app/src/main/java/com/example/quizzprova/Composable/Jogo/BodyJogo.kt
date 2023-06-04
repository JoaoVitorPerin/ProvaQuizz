package com.example.quizzprova.Composable.Jogo

import androidx.compose.runtime.Composable
import com.example.quizzprova.Model.PaisesList
import kotlin.random.Random

@Composable
fun BodyJogo(){
    var number = Random
    val jogo = number.nextInt(PaisesList.paises.size)
    JogoItem(jogo)
}