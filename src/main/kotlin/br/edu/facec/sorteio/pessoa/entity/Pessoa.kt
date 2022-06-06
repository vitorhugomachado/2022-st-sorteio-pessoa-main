package br.edu.facec.sorteio.pessoa.entity

import java.time.LocalDate
import java.util.UUID

class Pessoa constructor(
    val id: UUID = UUID.randomUUID(),
    val nome: String,
    val telefone: String,
    val email: String
) {
    var cpf: String? = null
    var nascimento: LocalDate? = null
    var endereco: String? = null

    init {
        if (nome.isBlank()) {
            throw IllegalArgumentException("Nome da pessoa deve ser informado.")
        }
        if (telefone.isBlank()) {
            throw IllegalArgumentException("Telefone da pessoa deve ser informado.")
        }
        if (email.isBlank()) {
            throw IllegalArgumentException("E-mail da pessoa deve ser informado.")
        }
    }

    fun hasId(id: UUID): Boolean {
        return this.id == id
    }

    fun hasNascimentoLessThan(data: LocalDate): Boolean {
        return nascimento == null || nascimento!!.isBefore(data)
    }

}