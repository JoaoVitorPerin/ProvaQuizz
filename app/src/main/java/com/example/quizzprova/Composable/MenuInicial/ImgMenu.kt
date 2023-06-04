package com.example.quizzprova.Composable

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
import com.example.quizzprova.R

@Composable
fun imgMenu(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Globe Guessing",
            style = MaterialTheme.typography.h3,
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Imagem logo",
            modifier = Modifier
                .size(400.dp)
        )
    }
}