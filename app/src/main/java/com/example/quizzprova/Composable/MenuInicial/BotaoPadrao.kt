package com.example.quizzprova.Composable

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quizzprova.JogoActivity
import com.example.quizzprova.LeaderboardActivity

@Composable
fun CollumBotoes() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotaoJogar()
        BotaoLeaderboard()
    }
}

@Composable
fun BotaoJogar() {
    val context = LocalContext.current
    val intent = Intent(context, JogoActivity::class.java)

    Button(
        onClick = {context.startActivity(intent)},
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Yellow,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .padding(8.dp)
            .size(200.dp, 50.dp)
    ) {
        Text(
            text = "JOGAR"
        )
    }
}

@Composable
fun BotaoLeaderboard() {
    val context = LocalContext.current
    val intent = Intent(context, LeaderboardActivity::class.java)

    Button(
        onClick = { context.startActivity(intent)},
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Yellow,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .padding(8.dp)
            .size(200.dp, 50.dp)
    ) {
        Text(
            text = "LEADERBOARD"
        )
    }
}