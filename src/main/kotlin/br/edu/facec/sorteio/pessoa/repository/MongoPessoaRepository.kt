package br.edu.facec.sorteio.pessoa.repository

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.InsertOneOptions
import java.util.*

class MongoPessoaRepository(private val mongoClient: MongoClient): PessoaRepository {

    private val pessoaCollection: MongoCollection<Pessoa> = mongoClient.getDatabase("sis-sorteio")
        .getCollection("pessoa", Pessoa::class.java)

    override fun save(pessoa: Pessoa) {
        pessoaCollection.insertOne(pessoa)
    }

    override fun existsById(id: UUID): Boolean {
        TODO("Not yet implemented")
    }

    override fun findById(id: UUID): Pessoa? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Pessoa> {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: UUID) {
        TODO("Not yet implemented")
    }

    override fun update(id: UUID, pessoa: Pessoa) {
        TODO("Not yet implemented")
    }
}