package Lista.ExDois

abstract class Sort<T : Comparable<T>> {
    abstract fun sort(list: List<T>) : List<T>
}

class BubbleSort<T : Comparable<T>> : Sort<T>() {
    override fun sort(list: List<T>): List<T> {
        val sortedList = list.toMutableList()
        val n = sortedList.size

        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (sortedList[j] > sortedList[j + 1]) {
                    // Troca os elementos
                    val temp = sortedList[j]
                    sortedList[j] = sortedList[j + 1]
                    sortedList[j + 1] = temp
                }
            }
        }
        return sortedList
    }
}