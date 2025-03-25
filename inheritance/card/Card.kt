package inheritance.card

import inheritance.contabancaria.ContaBancaria
import inheritance.idsys.CardNumber
import inheritance.titular.Titular

data class Card(
    private val contaBancaria: ContaBancaria
) {
    private val numero: CardNumber = CardNumber()

    fun getNumber(): String {
        return this.numero.getNumber()
    }
}