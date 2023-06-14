package com.example.quizzprova.Composable.Informacoes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun estruturaInfo(number: Int){
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        CabecalhoInfo(number)
        BodyInfo(number)
        FooterInfo(number)
    }
}