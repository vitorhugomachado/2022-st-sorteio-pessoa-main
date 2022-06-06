package br.edu.facec.sorteio.pessoa.repository

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import java.util.*

class MemoryPessoaRepository : PessoaRepository {

    private val database: MutableList<Pessoa> = mutableListOf()

    init {
        database.add(Pessoa(
            id = UUID.fromString("44623d7e-f7cb-44d3-b623-979b35636970"),
            nome = "Marcio",
            telefone = "4499999999",
            email = "marcio@email.com.br"
        ))
    }

    override fun save(pessoa: Pessoa) {
        database.add(pessoa)
    }

    override fun existsById(id: UUID): Boolean {
        return database.filter { it.hasId(id) }.isNotEmpty()
    }

    override fun findById(id: UUID): Pessoa? {
        for (pessoa in database) {
            if (pessoa.hasId(id)) {
                return pessoa
            }
        }
        return null
    }

    override fun findAll(): List<Pessoa> {
        return database.toList()
    }

    override fun deleteById(id: UUID) {
        database.removeIf { it.hasId(id) }
    }

    override fun update(id: UUID, pessoa: Pessoa) {
        for ((index, item) in database.withIndex()) {
            if (pessoa.hasId(id)) {
                database[index] = pessoa
            }
        }
    }


}