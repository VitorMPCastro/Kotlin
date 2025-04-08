package prova1.sistema_combustivel


import prova1.sistema_combustivel.combustiveis.Alcool
import prova1.sistema_combustivel.combustiveis.Gasolina
import java.util.*

fun combustiveis() {
    println("Digite o tipo de combustível (A - Álcool, G - Gasolina):")
    val tipo = readLine()?.trim()?.uppercase(Locale.getDefault()) ?: ""

    println("Digite a quantidade de litros vendidos:")
    val litrosInput = readLine()
    val litros = litrosInput?.toFloatOrNull()

    if (litros == null) {
        println("Quantidade de litros inválida!")
        return
    }

    val combustivel = when (tipo) {
        "A" -> Alcool()
        "G" -> Gasolina()
        else -> {
            println("Tipo de combustível inválido!")
            return
        }
    }

    val valorTotal = combustivel.getValorTotal(litros)
    println("Valor a ser pago: R$ ${"%.2f".format(valorTotal)}")
}