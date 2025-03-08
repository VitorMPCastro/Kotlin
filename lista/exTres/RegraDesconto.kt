package lista.exTres

abstract class RegraDesconto(
    private val limite: Int,
    private val descontoAbaixo: Int,
    private val descontoAcima: Int
) {
    fun getDesconto(litros: Float, preco: Float): Float {
        val descontoPorLitro = if (litros <= limite) descontoAbaixo else descontoAcima
        return litros * preco * (descontoPorLitro / 100f)
    }
}
