package inheritance.contabancaria.contasubtypes

import inheritance.contabancaria.ContaBancaria
import inheritance.titular.Titular

class ContaEspecial(titular: Titular, val limite: Float) : ContaBancaria(titular){
    override fun sacar(valorDoSaque: Float){
        if (valorDoSaque < -this.limite){
            throw Exception("Saque bloqueado. Limite de saldo seria ultrapassado.")
        }

        this.saldo -= valorDoSaque
    }
}