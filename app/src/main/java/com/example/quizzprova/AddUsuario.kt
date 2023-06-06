package com.example.quizzprova

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import com.example.quizzprova.ui.theme.QuizzProvaTheme

val usuario = mutableStateOf(TextFieldValue().text)

class AddUsuario : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuizzProvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    val context = LocalContext.current
                    val intent = Intent(context, JogoActivity::class.java)

                    AlertDialog(
                        onDismissRequest = {},
                        title = { Text("Digite seu nome:") },
                        text = {
                            Column {
                                TextField(
                                    value = usuario.value,
                                    onValueChange = { usuario.value = it }
                                )
                            }
                        },
                        confirmButton = {
                            Button(onClick = {context.startActivity(intent)}) {
                                Text("Confirmar")
                            }
                        },
                        dismissButton = {
                            Button(onClick = {this.finish()}) {
                                Text("Cancelar")
                            }
                        }
                    )
                }
            }
        }
    }
}