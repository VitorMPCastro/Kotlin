package Lista.ExDois

import com.sun.jdi.Value

class UserList {
    private val values = mutableListOf<Double>()

    fun addValue(value: Number) {
        values.add(value.toDouble())
    }

    fun getUserList(): List<Double> = values.toList()

    fun getSortedUserList(sorter: Sort<Double> = BubbleSort()): List<Double> {
        return sorter.sort(getUserList())
    }

    fun loop() {
        println("Digite um valor (ou 'FIM' para encerrar):")
        while (true) {
            val input = readLine()
            if (input == null || input.equals("FIM", ignoreCase = true)) {
                break
            }
            try {
                // Tenta converter o input para Double
                val number = input.toDouble()
                addValue(number)
            } catch (e: NumberFormatException) {
                println("Valor inválido. Por favor, digite um número ou 'FIM'.")
            }
            println("Digite um valor (ou 'FIM' para encerrar):")
        }
    }
}