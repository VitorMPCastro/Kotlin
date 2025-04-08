package prova1.temperaturas

fun temperaturas() {
    val fahrenheit = Fahrenheit()
    val celsius = Celsius()

    val foo = celsius.kelvinToTemp(fahrenheit.toKelvin(32f))
    val bar = fahrenheit.kelvinToTemp(celsius.toKelvin(0f))

    println("$foo ${celsius.abbrev} (${celsius.name})")
    println("$bar ${fahrenheit.abbrev} (${fahrenheit.name})")
}