package br.edu.facec.sorteio.pessoa.cdi

import br.edu.facec.sorteio.pessoa.repository.MemoryPessoaRepository
import br.edu.facec.sorteio.pessoa.repository.MongoPessoaRepository
import br.edu.facec.sorteio.pessoa.repository.PessoaRepository
import br.edu.facec.sorteio.pessoa.service.DefaultPessoaService
import br.edu.facec.sorteio.pessoa.service.PessoaService
import com.mongodb.client.MongoClient
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import jakarta.inject.Singleton

@Factory
class PessoaCDI {

    @Bean
    @Singleton
    fun pessoaService(pessoaRepository: PessoaRepository): PessoaService {
        return DefaultPessoaService(pessoaRepository)
    }

    @Bean
    @Singleton
    fun pessoaRepository(mongoClient: MongoClient): PessoaRepository {
        return MongoPessoaRepository(mongoClient)
    }

}