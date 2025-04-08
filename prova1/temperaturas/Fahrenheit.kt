package prova1.temperaturas

class Fahrenheit(override val name: String = "Fahrenheit", override val abbrev: Char = 'F') : TempScale() {
    override fun toKelvin(temp: Float): Float {
        val kelvin : Float = (temp - 32f) * (5f/9f) + 273.15f
        return kelvin
    }

    override fun kelvinToTemp(kelvin: Float): Float {
        val fahrenheit : Float = (kelvin - 273.15f) * (9f/5f) + 32
        return fahrenheit
    }
}