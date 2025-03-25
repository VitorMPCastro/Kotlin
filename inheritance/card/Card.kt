package inheritance.card

import inheritance.idsys.CardNumber
import inheritance.titular.Titular

data class Card(
    private val titular: Titular,
    private val numero: CardNumber = CardNumber()
) {
    fun getNumber(): String {
        return this.numero.getNumber()
    }
}