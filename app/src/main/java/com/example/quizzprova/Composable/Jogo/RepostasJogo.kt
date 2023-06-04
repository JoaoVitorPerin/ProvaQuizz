package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.example.quizzprova.Model.Pais

@Composable
fun criarBotoes(pais: Pais){
    Row() {
        BotaoJogo(pais, 0)
        BotaoJogo(pais, 1)
    }
    Row() {
        BotaoJogo(pais, 2)
        BotaoJogo(pais, 3)
    }
}