package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    Column(
                        modifier = Modifier
                            .background(Color.Black)
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Leaderboard:",
                            style = MaterialTheme.typography.h3,
                            color = Color.White
                        )

                        leaderboard.sortByDescending { it.score }
                        val fadeAnimDuration = 500 // Duração da animação de fade in (em milissegundos)
                        val fadeAnimDelayIncrement = 300 // Incremento de atraso para cada item (em milissegundos)
                        val maxFadeAnimDelay = fadeAnimDelayIncrement * leaderboard.size

                        val visibilityStates = remember {
                            leaderboard.mapIndexed { index, _ ->
                                mutableStateOf(index == 0)
                            }
                        }

                        leaderboard.forEachIndexed { index, usuario ->
                            val position: Int = index
                            val fadeAnimDelay = fadeAnimDelayIncrement * position

                            LaunchedEffect(key1 = visibilityStates[position].value) {
                                visibilityStates[position].value = true
                            }

                            AnimatedVisibility(
                                visible = visibilityStates[position].value,
                                enter = fadeIn(
                                    animationSpec = tween(
                                        durationMillis = fadeAnimDuration,
                                        delayMillis = fadeAnimDelay,
                                        easing = FastOutSlowInEasing
                                    )
                                ),
                                exit = fadeOut(
                                    animationSpec = tween(
                                        durationMillis = fadeAnimDuration,
                                        easing = FastOutSlowInEasing
                                    )
                                )
                            ) {
                                LeaderboardItem(usuario, position)
                            }
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
