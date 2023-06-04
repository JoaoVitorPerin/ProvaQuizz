package com.example.quizzprova.Model

import com.example.quizzprova.R

object PaisesList {
    val paises = listOf(
        Pais(
            id = 1,
            nome = "Argentina",
            imageId = R.drawable.argentina,
            respostas = listOf("Brasil", "Alemanha", "Hungria", "Argentina")
        ),
        Pais(
            id = 2,
            nome = "Brasil",
            imageId = R.drawable.brasil,
            respostas = listOf("Brasil", "Estados Unidos", "Japão", "Argentina")
        ),
        Pais(
            id = 3,
            nome = "Alemanha",
            imageId = R.drawable.alemanha,
            respostas = listOf("Argentina", "Alemanha", "Nigeria", "Kuwait")
        ),
        Pais(
            id = 4,
            nome = "Kuwait",
            imageId = R.drawable.kuwait,
            respostas = listOf("Suecia", "Australia", "Romenia", "Kuwait")
        ),
        Pais(
            id = 5,
            nome = "Romenia",
            imageId = R.drawable.romenia,
            respostas = listOf("Estados Unidos", "Kuwait", "Romenia", "Nigeria")
        ),
        Pais(
            id = 6,
            nome = "Estados Unidos",
            imageId = R.drawable.eua,
            respostas = listOf("Estados Unidos", "Romenia", "Kuwait", "Reino Unido")
        ),
        Pais(
            id = 7,
            nome = "Nigeria",
            imageId = R.drawable.nigeria,
            respostas = listOf("Brasil", "Nigeria", "Kuwait", "Japão")
        )
    )
}