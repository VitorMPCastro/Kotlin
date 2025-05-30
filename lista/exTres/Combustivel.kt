package lista.exTres

abstract class Combustivel(var preco: Float, var regraDesconto: RegraDesconto) {
    fun getValorTotal(litros: Float): Float {
        val total = preco * litros
        val desconto = regraDesconto.getDesconto(litros, preco)
        return total - desconto
    }
}
