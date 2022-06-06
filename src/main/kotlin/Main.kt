import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("br.edu.facec.sorteio")
        .start()
}