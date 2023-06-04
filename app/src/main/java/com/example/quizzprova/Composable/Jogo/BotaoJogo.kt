package com.example.quizzprova.Composable.Jogo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.quizzprova.JogoActivity
import com.example.quizzprova.Model.Pais

@Composable
fun BotaoJogo(pais: Pais, number: Int) {
    var context = LocalContext.current;
    val intent = Intent(context, JogoActivity::class.java)
    val activity = (LocalContext.current as? Activity)

    Button(
        onClick = {
            ChecarRepostas(
                nomePaisCorreto = pais.nome,
                nomePaisSelecionado = pais.respostas[number],
                context
            )
            if (activity != null) {
                activity.finish()
            };
            context.startActivity(intent)
        },
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Yellow,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .padding(8.dp)
            .size(100.dp, 100.dp)
    ) {
        Text(text = pais.respostas[number])
    }
}

fun ChecarRepostas(nomePaisCorreto: String, nomePaisSelecionado: String, context : Context) {
    if (nomePaisCorreto == nomePaisSelecionado) {
        Toast.makeText(context, "Resposta Correta!", Toast.LENGTH_SHORT).show()
    }else{
        Toast.makeText(context, "Resposta Errada!", Toast.LENGTH_SHORT).show()
    }
}
