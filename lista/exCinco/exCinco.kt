package lista.exCinco

fun exCinco() {
    val notas = listOf(8.5, 7.0, 9.5)
    val pesos = listOf(2, 3, 5)

    val mediaCalculator: MediaCalculator = MediaPonderadaCalculator()
    val mediaFinal = mediaCalculator.calcularMedia(notas, pesos)

    println("Média Final: %.2f".format(mediaFinal))
}
