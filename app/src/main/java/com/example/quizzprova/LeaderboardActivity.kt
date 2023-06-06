package com.example.quizzprova

import android.os.Bundle
import android.widget.Toast
import android.content.Context
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizzprova.Composable.Jogo.score
import com.example.quizzprova.Model.Usuario
import com.example.quizzprova.ui.theme.QuizzProvaTheme

val leaderboard = mutableListOf<Usuario>()

class LeaderboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    val context = LocalContext.current
                    Toast.makeText(context, "${leaderboard}", Toast.LENGTH_SHORT).show()
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
