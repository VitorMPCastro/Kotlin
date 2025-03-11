package lista.exQuatro

fun exQuatro() {
    val fahrenheit = Fahrenheit()
    val celsius = Celsius()

    val foo = celsius.kelvinToTemp(fahrenheit.toKelvin(32f)) // 32 deg Fahrenheit to Celsius. Expected: 0C
    val bar = fahrenheit.kelvinToTemp(celsius.toKelvin(0f)) // 0 deg Celsius to Fahrenheit. Expected: 32F

    println("$foo ${celsius.abbrev} (${celsius.name})")
    println("$bar ${fahrenheit.abbrev} (${fahrenheit.name})")
}