package lista.exOito

fun exOito() {
    val salarioAtual = 4000f
    val service = SalarioService()
    val novoSalario = service.calcularNovoSalario(salarioAtual)

    println("Novo salário com aumento: R$%.2f".format(novoSalario))
}
