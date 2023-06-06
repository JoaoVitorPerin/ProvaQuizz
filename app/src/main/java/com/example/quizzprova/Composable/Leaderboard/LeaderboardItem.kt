package com.example.quizzprova.Composable.Leaderboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Model.Usuario

@Composable
fun LeaderboardItem(usuario: Usuario, position : Int){
    Card(modifier = Modifier
        .padding(10.dp)
        .height(80.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(10.dp)
        )
    ) {
        Row(modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Column() {
                Text(text = "${position + 1}º",
                    style = MaterialTheme.typography.h3
                )
            }
            Column() {
                Text(text = "Jogador:",
                    style = MaterialTheme.typography.body1)

                Text(text = "${usuario.nome}",
                    style = MaterialTheme.typography.h5)
            }
            Column() {
                Text(text = "Score:",
                    style = MaterialTheme.typography.body1)

                Text(text = "${usuario.score}",
                    style = MaterialTheme.typography.h5)
            }
        }
    }
}
