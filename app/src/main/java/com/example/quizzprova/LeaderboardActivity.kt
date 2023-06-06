package com.example.quizzprova

import android.os.Bundle
import android.widget.Toast
import android.content.Context
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Composable.Jogo.score
import com.example.quizzprova.Composable.Leaderboard.LeaderboardItem
import com.example.quizzprova.Model.Usuario
import com.example.quizzprova.ui.theme.QuizzProvaTheme

val leaderboard = mutableListOf<Usuario>()

class LeaderboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    color = Color.Black
                ) {
                    val context = LocalContext.current
                    for (usuario in leaderboard){
                        LeaderboardItem(usuario)
                    }
                }
            }
        }
    }
}

fun addOnLeaderboard(){
    if (leaderboard.size < 10){
        leaderboard.add(Usuario(usuario.value, score.value))
    }
}

