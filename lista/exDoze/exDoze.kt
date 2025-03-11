package lista.exDoze

fun exDoze() {
    val salarios = listOf(1500f, 2000f, 2500f, 3000f)
    val filhos = listOf(1, 2, 1, 3)

    val service = PesquisaService()
    val estatisticas = service.calcularEstatisticas(salarios, filhos)

    println("Média Salarial: ${estatisticas["mediaSalario"]}, Média de Filhos: ${estatisticas["mediaFilhos"]}, Maior Salário: ${estatisticas["maiorSalario"]}")
}
