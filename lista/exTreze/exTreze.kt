package lista.exTreze

fun exTreze() {
    val service = FibonacciService()
    val sequencia = service.gerarSequencia(20)
    println(sequencia)
}
