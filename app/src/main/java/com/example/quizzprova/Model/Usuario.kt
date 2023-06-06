package com.example.quizzprova.Model

import java.io.Serializable

data class Usuario(
    val nome: String,
    val score : Int
) : Serializable
