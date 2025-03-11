package lista.exQuatro

abstract class TempScale {

    abstract val name : String
    abstract val abbrev : Char

    abstract fun toKelvin(temp : Float) : Float

    abstract fun kelvinToTemp(kelvin : Float) : Float
}