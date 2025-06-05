package com.example.test.models

data class Pessoa(val nome: String, val idade: Int) {
    fun apresentar() = "Ola, meu nome e $nome e tenho $idade anos."
    fun podeVotar() = if (idade >=16) "Pode votar" else "Não pode votar."
    fun faixaEtaria() = when {
        idade >= 60 -> "Idoso(a)"
        idade >= 18 -> "Adulto(a)"
        idade >= 12 -> "Jovem(a)"
        else -> "Criança"
    }
}