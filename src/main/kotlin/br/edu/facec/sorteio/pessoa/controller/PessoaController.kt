package br.edu.facec.sorteio.pessoa.controller

import br.edu.facec.sorteio.pessoa.entity.Pessoa
import br.edu.facec.sorteio.pessoa.service.PessoaService
import io.micronaut.http.annotation.*
import jakarta.inject.Inject
import java.util.*

@Controller
class PessoaController(@Inject private val pessoaService: PessoaService) {

    @Post("/pessoas")
    fun create(@Body pessoa: Pessoa): UUID {
        return pessoaService.save(pessoa)
    }

    @Get("/pessoas/{id}")
    fun findById(@PathVariable("id") id: UUID): Pessoa? {
        return pessoaService.findById(id)
    }

    @Put("/pessoas/{id}")
    fun update(@PathVariable("id") id: UUID, @Body pessoa: Pessoa) {
        pessoaService.update(id, pessoa)
    }

    @Get("/pessoas")
    fun findAll(): List<Pessoa> {
        return pessoaService.findAll()
    }

    @Delete("/pessoas/{id}")
    fun deleteById(id: UUID) {
        return pessoaService.deleteById(id)
    }
}