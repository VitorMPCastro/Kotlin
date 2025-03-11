package lista.exSete

fun exSete() {
    val conta = ContaBancaria(numeroConta = "12345", saldo = 500.0f)

    val debito = 600.0f
    val credito = 200.0f

    conta.atualizarSaldo(debito, credito)

    println("Conta: ${conta.numeroConta}")
    println("Saldo Atual: R$%.2f".format(conta.saldo))
    println(conta.verificarSaldo())
}
