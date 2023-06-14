package com.example.quizzprova.Composable.Informacoes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Model.PaisesList

@Composable
fun BodyInfo(number: Int) {
    var pais = PaisesList.paises[number]
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(30.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Informações",
                style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold),
                color = Color.Yellow

            )
            Text(
                text = pais.informacoes,
                style = MaterialTheme.typography.body1,
                color = Color.Yellow
            )
        }
    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(30.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Comida Típica",
                style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.Bold),
                color = Color.Yellow

            )
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(pais.imageComida),
                    contentDescription = "Imagem do país!",
                    modifier = Modifier
                        .size(180.dp, 150.dp)
                )
                Text(
                    text = pais.descComida,
                    modifier = Modifier.padding(30.dp),
                    style = MaterialTheme.typography.body2,
                    color = Color.Yellow
                )
            }

        }
    }
}