package inheritance.contabancaria

import inheritance.idsys.AccountNumber
import inheritance.titular.Titular

abstract class ContaBancaria {
    abstract val titular: Titular
    val numConta: AccountNumber = AccountNumber()
    abstract var saldo: Float

    fun sacar(valorDoSaque: Float){
        if (valorDoSaque > this.saldo){
            throw Exception("Saldo Insuficiente.")
        }
        this.saldo -= valorDoSaque
    }
}