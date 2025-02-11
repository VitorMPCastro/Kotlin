import src.HelloWorldClass

fun main() {
    val helloWorld = HelloWorldClass()
    val myArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    helloWorld.sayHelloWorld()

    helloWorld.sayGoodbye()

    println(helloWorld.sumArray(myArray))
}