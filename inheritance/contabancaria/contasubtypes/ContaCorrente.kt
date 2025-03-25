package inheritance.contabancaria.contasubtypes

import inheritance.contabancaria.ContaBancaria
import inheritance.titular.Titular
import java.time.LocalDate

class ContaCorrente(titular: Titular) : ContaBancaria(titular) {}