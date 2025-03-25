package inheritance.contabancaria

import inheritance.idsys.AccountNumber
import inheritance.titular.Titular

abstract class ContaBancaria {
    abstract val titular: Titular
    val numConta: AccountNumber = AccountNumber()
    var saldo: Float = 0.0f

    open fun sacar(valorDoSaque: Float){
        if (valorDoSaque > this.saldo){
            throw Exception("Saldo Insuficiente.")
        }
        this.saldo -= valorDoSaque
    }

    fun depositar(valorDoDeposito: Float){
        if (valorDoDeposito <= 0){
            throw Exception("Valor de depósito não pode ser negativo.")
        }
        this.saldo += valorDoDeposito
    }
}