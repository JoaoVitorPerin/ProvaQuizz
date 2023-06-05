package com.example.quizzprova.Composable.Jogo

import androidx.compose.runtime.Composable
import com.example.quizzprova.Model.PaisesList
import kotlin.random.Random

@Composable
fun BodyJogo(){
    val numerosGerados = mutableSetOf<Int>()
    val tamanhoLista = PaisesList.paises.size
    
    val numero = Random.nextInt(tamanhoLista)
    if (numero !in numerosGerados) {
        numerosGerados.add(numero)
        JogoItem(numero)
    }

}