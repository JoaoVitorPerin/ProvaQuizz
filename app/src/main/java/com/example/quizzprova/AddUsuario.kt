package com.example.quizzprova

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.AlertDialog
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
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
                    color = Color.DarkGray
                ) {
                    val context = LocalContext.current
                    val intent = Intent(context, JogoActivity::class.java)

                    AlertDialog(
                        onDismissRequest = {},
                        title = { Text("Digite seu nome:",style = TextStyle(color = Color.White)) },
                        text = {
                            Column {
                                OutlinedTextField(
                                    value = usuario.value,
                                    onValueChange = { usuario.value = it },
                                    colors = TextFieldDefaults.textFieldColors(
                                        textColor = Color.Yellow
                                    )
                                )
                            }
                        },
                        confirmButton = {
                            androidx.compose.material.Button(
                                onClick = {
                                    if (usuario.value != "") {
                                        context.startActivity(intent)
                                    }else{
                                        Toast.makeText(context, "Usuário inválido!", Toast.LENGTH_SHORT).show()
                                    }
                                },
                                colors = ButtonDefaults.textButtonColors(
                                    backgroundColor = Color.Green,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier
                                    .padding(8.dp)
                                    .size(1000.dp, 50.dp)
                            ) {
                                Text("Confirmar")
                            }
                        },
                        dismissButton = {
                            androidx.compose.material.Button(
                                onClick = {this.finish()},
                                colors = ButtonDefaults.textButtonColors(
                                    backgroundColor = Color.Red,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier
                                    .padding(8.dp)
                                    .size(1000.dp, 50.dp)
                            ) {
                                Text("Cancelar")
                            }
                        }
                    )
                }
            }
        }
    }
}