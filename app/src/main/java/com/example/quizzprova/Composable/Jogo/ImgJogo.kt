package com.example.quizzprova.Composable.Jogo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Model.Pais
import com.example.quizzprova.R

@Composable
fun imgJogo(pais: Pais){
    Image(
        painter = painterResource(pais.imageId),
        contentDescription = "Imagem do país a adivinhar!",
        modifier = Modifier
            .size(400.dp,300.dp)
    )
}