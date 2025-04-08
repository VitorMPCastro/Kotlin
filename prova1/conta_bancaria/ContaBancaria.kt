package prova1.conta_bancaria

data class ContaBancaria(
    val numeroConta: String,
    var saldo: Float
) {
    fun atualizarSaldo(debito: Float, credito: Float) {
        saldo = saldo - debito + credito
    }

    fun verificarSaldo(): String {
        return if (saldo >= 0) "Saldo Positivo" else "Saldo Negativo"
    }
}