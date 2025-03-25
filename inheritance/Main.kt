package inheritance

import inheritance.card.Card
import inheritance.contabancaria.ContaBancaria
import inheritance.contabancaria.contasubtypes.ContaPoupanca
import inheritance.titular.Titular
import java.time.LocalDate
import kotlin.reflect.typeOf


fun main(){
    val titularDaSilva = Titular("Euzinho da Silva de Oliveira", LocalDate.of(2005,5,31))
    val contaPoupanca = ContaPoupanca(12,titularDaSilva)
    val cartaoDaPoupanca = Card(contaPoupanca)

    fun printContaPoupanca(){
        println("Informações da Conta:\n" +
                "Tipo da conta: ${contaPoupanca::class.simpleName}\n" +
                "Número da conta: ${contaPoupanca.numConta.getNumber()}\n" +
                "Saldo disponível: ${contaPoupanca.saldo}\n" +
                "Dia de rendimento: ${contaPoupanca.getDiaRendimento()}\n" +
                "Número do cartão: ${cartaoDaPoupanca.getNumber()}\n")
    }

    contaPoupanca.depositar(100f)

    printContaPoupanca()
    println(contaPoupanca.calcularNovoSaldo(0.1245f)+contaPoupanca.saldo)

    contaPoupanca.sacar(19.99f)
    printContaPoupanca()
    println(contaPoupanca.calcularNovoSaldo(0.1245f)+contaPoupanca.saldo) //taxa de rendimendo de 12.45%

}