package com.example.quizzprova.Composable.Leaderboard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Model.Usuario

@Composable
fun LeaderboardItem(usuario: Usuario){
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ) {
        Row(modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Text(text = "${usuario.nome} | ${usuario.score}")
        }

    }
}
