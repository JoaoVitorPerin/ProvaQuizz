package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Composable.BotaoSair
import com.example.quizzprova.Composable.CollumBotoes
import com.example.quizzprova.Composable.imgMenu
import com.example.quizzprova.ui.theme.QuizzProvaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    CollumMenu()
                }
            }
        }
    }
}

@Composable
fun CollumMenu() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        imgMenu()
        CollumBotoes()
        BotaoSair()
    }
}