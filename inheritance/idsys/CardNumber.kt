package inheritance.idsys

class CardNumber(private val number: String = generateCardNumber()) : CardNumberGenerator() {
    fun getNumber(): String {
        return this.number
    }
}