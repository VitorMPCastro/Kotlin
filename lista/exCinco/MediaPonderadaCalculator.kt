package lista.exCinco

class MediaPonderadaCalculator : MediaCalculator {
    override fun calcularMedia(notas: List<Double>, pesos: List<Int>): Double {
        require(notas.size == pesos.size) { "O número de notas e pesos deve ser o mesmo." }
        val totalPesos = pesos.sum()
        val media = notas.zip(pesos).sumOf { (nota, peso) -> nota * peso } / totalPesos
        return media
    }
}