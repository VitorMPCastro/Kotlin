package inheritance.contabancaria.contasubtypes

import inheritance.contabancaria.ContaBancaria
import inheritance.titular.Titular
import java.time.LocalDate

class ContaCorrente : ContaBancaria() {
    override val titular: Titular = Titular("Alan", LocalDate.of(2005,5,31))
    override var saldo: Float = 0.0f
        set(value) {
            saldo += value
        }
}