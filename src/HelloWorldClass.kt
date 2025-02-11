package src

class HelloWorldClass() {
    fun sayHelloWorld() {
        println("Hello world!")
    }

    fun sayGoodbye(){
        println("Bye!")
    }

    fun sumArray(array: IntArray): Int {
        var sum = 0
        for (num in array){
            sum += num
        }
        return sum
    }
}