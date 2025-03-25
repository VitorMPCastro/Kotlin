package inheritance.idsys

class AccountNumber(private val number: String = generateAccountNumber()) : AccountNumberGenerator() {
    fun getNumber(): String {
        return this.number
    }
}