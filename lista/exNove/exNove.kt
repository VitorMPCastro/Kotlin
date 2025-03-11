package lista.exNove

import java.time.LocalDate

fun exNove() {
    val anoNascimento = 1995
    val anoAtual = LocalDate.now().year

    val service = IdadeService()
    val idades = service.calcularIdade(anoNascimento, anoAtual)

    println("Idade: ${idades["anos"]} anos, ${idades["meses"]} meses, ${idades["dias"]} dias, ${idades["semanas"]} semanas")
}
