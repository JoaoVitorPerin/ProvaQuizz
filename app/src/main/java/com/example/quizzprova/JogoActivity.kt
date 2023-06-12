package com.example.quizzprova

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.quizzprova.Composable.Jogo.BodyJogo
import com.example.quizzprova.Composable.Jogo.HeaderJogo
import com.example.quizzprova.Composable.Jogo.contador
import com.example.quizzprova.Composable.Jogo.score
import com.example.quizzprova.Model.Usuario
import com.example.quizzprova.ui.theme.QuizzProvaTheme

class JogoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            val intent = Intent(context, MainActivity::class.java)
            QuizzProvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    if(contador.value == 5){
                        addOnLeaderboard()
                        finishAndRemoveTask()
                        context.startActivity(intent)
                    }else{
                        HeaderJogo()
                        BodyJogo()
                    }
                }
            }
        }
    }
}