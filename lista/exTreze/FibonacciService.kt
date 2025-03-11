package lista.exTreze

class FibonacciService {
    fun gerarSequencia(n: Int): List<Int> {
        val sequencia = mutableListOf(1, 1)
        for (i in 2 until n) {
            sequencia.add(sequencia[i - 1] + sequencia[i - 2])
        }
        return sequencia
    }
}