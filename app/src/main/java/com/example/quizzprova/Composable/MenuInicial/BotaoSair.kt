package com.example.quizzprova.Composable

import android.app.Activity
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

@Composable
fun BotaoSair() {
    val activity = (LocalContext.current as? Activity)
    Button(
        onClick = { activity?.finishAndRemoveTask() },
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Red,
            contentColor = Color.White
        ),
        modifier = Modifier
            .padding(8.dp)
            .size(100.dp, 50.dp)
    ) {
        Text(
            text = "SAIR"
        )
    }
}