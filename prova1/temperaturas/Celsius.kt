package prova1.temperaturas

class Celsius(override val name: String = "Celsius", override val abbrev: Char = 'C') : TempScale() {
    override fun toKelvin(temp: Float): Float {
        return temp + 273.15f
    }

    override fun kelvinToTemp(kelvin: Float): Float {
        return kelvin - 273.15f
    }
}