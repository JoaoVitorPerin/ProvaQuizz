package com.example.quizzprova.Model

import java.io.Serializable

data class Pais(
    val id: Int,
    val nome: String,
    val imageId: Int,
    val respostas: List<String>
) : Serializable