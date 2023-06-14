package com.example.quizzprova.Composable.Informacoes

import android.app.Activity
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quizzprova.Composable.Jogo.ChecarRepostas
import com.example.quizzprova.Informacoes
import com.example.quizzprova.JogoActivity
import com.example.quizzprova.Model.PaisesList
import com.example.quizzprova.numeroPais

@Composable
fun FooterInfo(number: Int) {
    var context = LocalContext.current;
    val intent = Intent(context, Informacoes::class.java)
    val activity = (LocalContext.current as? Activity)

    var pais = PaisesList.paises[number]
    Row() {
        Button(
            onClick = {
                if (numeroPais.value == 0){
                    numeroPais.value = 29;
                }else {
                    numeroPais.value = numeroPais.value - 1;
                }
            },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.Yellow,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp, 50.dp)
        ) {
            Text(text = "Anterior",
                style = MaterialTheme.typography.body1)
        }
        Button(
            onClick = {
                if (numeroPais.value == 29){
                    numeroPais.value = 0;
                }else {
                    numeroPais.value = numeroPais.value + 1;
                }
            },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.Yellow,
                contentColor = Color.Black
            ),
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp, 50.dp)
        ) {
            Text(text = "Proximo",
                style = MaterialTheme.typography.body1)
        }
    }

}