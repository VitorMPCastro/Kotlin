package Lista.ExDois

fun ExDois () {
    val userList = UserList()

    // Exemplo de adição de valores
    userList.addValue(5)        // Int
    userList.addValue(3.2)      // Double
    userList.addValue(8.0f)     // Float

    // Exibindo a lista original
    println("Lista original: ${userList.getUserList()}")

    // Ordenando a lista
    val sortedList = userList.getSortedUserList()
    println("Lista ordenada: $sortedList\n Lista do usuário: \n")

    // Solicita os valores ao usuário até que ele digite "FIM"
    userList.loop()

    // Obtém e imprime a lista na forma original (não ordenada)
    val originalList = userList.getUserList()
    println("Lista original: $originalList")

    // Obtém e imprime a lista ordenada utilizando BubbleSort (ou outro sorter, se desejar)
    val sortedUserList = userList.getSortedUserList()
    println("Lista ordenada: $sortedUserList")
}