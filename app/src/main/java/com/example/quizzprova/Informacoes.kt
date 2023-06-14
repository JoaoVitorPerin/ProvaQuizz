package com.example.quizzprova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.quizzprova.Composable.Informacoes.estruturaInfo
import com.example.quizzprova.ui.theme.ui.theme.QuizzProvaTheme

val numeroPais = mutableStateOf(0)

class Informacoes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    estruturaInfo(numeroPais.value)
                }
            }
        }
    }
}


