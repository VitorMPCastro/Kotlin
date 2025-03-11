package lista.exOito

class SalarioService(private val aumentoPercentual: Float = 0.25f) {
    fun calcularNovoSalario(salarioAtual: Float): Float {
        return salarioAtual * (1 + aumentoPercentual)
    }
}