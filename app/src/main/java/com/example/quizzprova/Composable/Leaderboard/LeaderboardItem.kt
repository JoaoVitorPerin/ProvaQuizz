package com.example.quizzprova.Composable.Leaderboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Model.Usuario
import com.example.quizzprova.R

@Composable
fun LeaderboardItem(usuario: Usuario, position : Int){
    Card(modifier = Modifier
        .padding(10.dp)
        .height(80.dp)
        .fillMaxWidth()
        .background(Color.Black),
        shape = RoundedCornerShape(corner = CornerSize(10.dp)
        )
    ) {
        Row(modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Column() {
                if (position == 0){
                    Image(
                        painter = painterResource(id = R.drawable.campeao),
                        contentDescription = "Imagem campeao",
                        modifier = Modifier
                            .size(70.dp)
                    )
                }else if (position == 1){
                    Image(
                        painter = painterResource(id = R.drawable.vice),
                        contentDescription = "Imagem vice",
                        modifier = Modifier
                            .size(70.dp)
                    )
                }else if (position == 2){
                    Image(
                        painter = painterResource(id = R.drawable.terceiro),
                        contentDescription = "Imagem terceiro",
                        modifier = Modifier
                            .size(70.dp)
                    )
                }else{
                    Text(text = "${position + 1}º",
                        style = MaterialTheme.typography.h3,
                        color = Color.Yellow
                    )
                }
            }
            Column() {
                Text(text = "Jogador:",
                    style = MaterialTheme.typography.body1,
                    color = Color.Yellow)

                Text(text = "${usuario.nome}",
                    style = MaterialTheme.typography.h5,
                    color = Color.Yellow)
            }
            Column() {
                Text(text = "Score:",
                    style = MaterialTheme.typography.body1,
                    color = Color.Yellow)

                Text(text = "${usuario.score}",
                    style = MaterialTheme.typography.h5,
                    color = Color.Yellow)
            }
        }
    }
}
