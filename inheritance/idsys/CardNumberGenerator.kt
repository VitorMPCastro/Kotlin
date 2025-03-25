package inheritance.idsys

import java.security.SecureRandom

abstract class CardNumberGenerator {
    internal companion object CardNumberGeneratorFactory{
        fun generateCardNumber(prefix: String = "4", length: Int = 16): String {
            val secureRandom = SecureRandom()
            val cardWithoutCheckDigit = (1 until length - 1)
                .map { secureRandom.nextInt(10) }
                .joinToString("", prefix)

            val checkDigit = calculateLuhnCheckDigit(cardWithoutCheckDigit)
            return cardWithoutCheckDigit + checkDigit
        }

        fun calculateLuhnCheckDigit(number: String): Int {
            val digits = number.map { it.digitToInt() }.reversed()
            val sum = digits.mapIndexed { index, digit ->
                if (index % 2 == 0) digit else (digit * 2).let { if (it > 9) it - 9 else it }
            }.sum()

            return (10 - (sum % 10)) % 10
        }
    }
}