package lista.exSeis

fun exSeis() {
    val horasTrabalhadas = 170
    val salarioPorHora = 20.0f

    val salarioCalculator: SalarioCalculator = SalarioComHoraExtra()
    val salarioTotal = salarioCalculator.calcularSalario(horasTrabalhadas, salarioPorHora)

    println("Salário Total: R$%.2f".format(salarioTotal))
}
