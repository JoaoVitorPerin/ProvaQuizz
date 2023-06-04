package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Composable.Jogo.BodyJogo
import com.example.quizzprova.Composable.Jogo.HeaderJogo
import com.example.quizzprova.ui.theme.QuizzProvaTheme

class JogoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    HeaderJogo()
                    BodyJogo()
                }
            }
        }
    }
}