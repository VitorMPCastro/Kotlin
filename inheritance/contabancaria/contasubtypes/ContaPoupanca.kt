package inheritance.contabancaria.contasubtypes

import inheritance.contabancaria.ContaBancaria
import inheritance.titular.Titular

class ContaPoupanca(val diaRendimento: Int, override val titular: Titular) : ContaBancaria() {
    fun calcularNovoSaldo(taxaDeRendimento: Float): Float {
        this.saldo *= taxaDeRendimento
        return this.saldo
    }
}