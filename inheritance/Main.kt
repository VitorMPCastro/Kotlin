package inheritance

import inheritance.card.Card
import inheritance.contabancaria.contasubtypes.ContaCorrente
import inheritance.titular.Titular
import java.time.LocalDate

fun main(){
    val alan: Titular = Titular("Alan", LocalDate.of(2005,5,31))
    val cartaoDoAlan = Card(alan)
    val contaCorrente = ContaCorrente()

    contaCorrente.sacar(100f)
}