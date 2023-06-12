package com.example.quizzprova

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Composable.Jogo.score
import com.example.quizzprova.Composable.Leaderboard.LeaderboardItem
import com.example.quizzprova.Model.Usuario
import com.example.quizzprova.ui.theme.QuizzProvaTheme
import kotlin.math.log

val leaderboard = mutableListOf<Usuario>()

class LeaderboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    color = Color.Black
                ) {
                    Column(modifier = Modifier
                        .background(Color.Black)
                        .fillMaxSize()) {
                        Text(text = "Leaderboard:",
                        style = MaterialTheme.typography.h3,
                        color = Color.White)
                        leaderboard.sortByDescending { it.score }
                        for ((index, usuario) in leaderboard.withIndex()) {
                            val position: Int = index
                            LeaderboardItem(usuario, position)
                        }
                    }
                }
            }
        }
    }
}

fun addOnLeaderboard() {
    val novoUsuario = Usuario(usuario.value, score.value)

    // Verifica se o usuário já existe no leaderboard
    val usuarioExistente = leaderboard.find { it.nome == novoUsuario.nome }

    if (usuarioExistente != null) {
        // Se o usuário já existe, verifica se o novo score é maior
        if (score.value > usuarioExistente.score) {
            leaderboard.remove(usuarioExistente)
            leaderboard.add(novoUsuario)
        }
    } else {
        // Se o usuário não existe, adiciona-o ao leaderboard
        leaderboard.add(novoUsuario)
    }
}
