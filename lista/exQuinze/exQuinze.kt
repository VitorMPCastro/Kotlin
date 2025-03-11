package lista.exQuinze

class Calculadora {
    fun soma(a: Float, b: Float) = a + b
    fun subtracao(a: Float, b: Float) = a - b
    fun multiplicacao(a: Float, b: Float) = a * b
    fun divisao(a: Float, b: Float) = if (b != 0f) a / b else throw IllegalArgumentException("Divisão por zero")
}
