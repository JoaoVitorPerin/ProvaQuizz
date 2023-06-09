package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                    Box(
                        modifier = Modifier
                            .background(Color.Black)
                            .fillMaxSize()
                            .padding(vertical = 16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 16.dp)
                                .scrollable(
                                    orientation = Orientation.Vertical,
                                    state = rememberScrollState()
                                )
                                .verticalScroll(rememberScrollState())
                        ) {
                            Text(
                                text = "LEADERBOARD:",
                                style = MaterialTheme.typography.h4,
                                color = Color.Yellow,
                                modifier = Modifier.padding(bottom = 16.dp)
                            )

                            leaderboard.sortByDescending { it.score }
                            val duracaoEfeitoFade = 500 // Duração da animação de fade in (em milissegundos)
                            val incrementoEfeitoFade = 150 // Incremento de atraso para cada item (em milissegundos)

                            val visibilityStates = remember {
                                leaderboard.mapIndexed { index, _ ->
                                    mutableStateOf(index == 0)
                                }
                            }

                            leaderboard.take(10).forEachIndexed { index, usuario ->
                                val posicao: Int = index
                                val fadeDelay = incrementoEfeitoFade * posicao

                                LaunchedEffect(key1 = visibilityStates[posicao].value) {
                                    visibilityStates[posicao].value = true
                                }

                                AnimatedVisibility(
                                    visible = visibilityStates[posicao].value,
                                    enter = fadeIn(
                                        animationSpec = tween(
                                            durationMillis = duracaoEfeitoFade,
                                            delayMillis = fadeDelay,
                                            easing = FastOutSlowInEasing
                                        )
                                    ),
                                    exit = fadeOut(
                                        animationSpec = tween(
                                            durationMillis = duracaoEfeitoFade,
                                            easing = FastOutSlowInEasing
                                        )
                                    )
                                ) {
                                    LeaderboardItem(usuario, posicao)
                                }
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
