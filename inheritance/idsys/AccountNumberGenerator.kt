package inheritance.idsys

import java.security.SecureRandom

abstract class AccountNumberGenerator {

    internal companion object AccountNumberGeneratorFactory{
        fun generateAccountNumber(length: Int = 12): String {
            val secureRandom = SecureRandom()
            val accountNumber = (1..length - 1)
                .map { secureRandom.nextInt(10) }
                .joinToString("")

            val checksum = accountNumber.sumOf { it.digitToInt() } % 10
            return accountNumber + checksum
        }
    }
}