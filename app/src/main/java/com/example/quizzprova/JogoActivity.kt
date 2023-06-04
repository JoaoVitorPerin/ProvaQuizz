package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizzprova.Composable.BotaoSair
import com.example.quizzprova.Composable.CollumBotoes
import com.example.quizzprova.Composable.Jogo.JogoItem
import com.example.quizzprova.Composable.imgMenu
import com.example.quizzprova.Model.PaisesList
import com.example.quizzprova.ui.theme.QuizzProvaTheme
import kotlin.random.Random

class JogoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    var number = Random
                    val jogo = number.nextInt(PaisesList.paises.size)
                    JogoItem(jogo)
                }
            }
        }
    }
}


