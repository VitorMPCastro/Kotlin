package inheritance.contabancaria.contasubtypes

import inheritance.contabancaria.ContaBancaria
import inheritance.titular.Titular

class ContaPoupanca(private val diaRendimento: Int, titular: Titular) : ContaBancaria(titular) {
    fun calcularNovoSaldo(taxaDeRendimento: Float): Float {
        val rendimento = taxaDeRendimento * this.saldo
        return rendimento
    }

    private fun aplicarNovoSaldo(diaAtual: Int, taxaDeRendimento: Float) {
        val rendimento: Float = calcularNovoSaldo(taxaDeRendimento)
        if (diaAtual == getDiaRendimento()){
            this.saldo += rendimento
        }
    }

    fun getDiaRendimento(): Int {
        return this.diaRendimento
    }
}