package lista.exUm

/*A definição de peso ideal é uma equação de reta, logo,
 vou usar a fórmula de uma função linear (MX+B)
 para representar isso.*/
abstract class Operation() {
    abstract fun pesoIdeal(x:Float) : Float
}

class PesoIdealMasc() : Operation() {
    override fun pesoIdeal(x: Float) : Float{
        return (72.7f * x) - 58
    }
}

class PesoIdealFem() : Operation() {
    override fun pesoIdeal(x: Float) : Float{
        return (62.1f * x) - 44.7f
    }
}

object PesoIdealFactory {
    fun getCalculator(pessoa: Pessoa): Operation {
        return when (pessoa.generoBio) {
            GeneroBioEnum.MASC -> PesoIdealMasc()
            GeneroBioEnum.FEM -> PesoIdealFem()
            else -> throw IllegalArgumentException("Gênero inválido")
        }
    }
}

class PesoIdeal {
    fun getPesoIdeal(pessoa: Pessoa): String {
        val calculator = PesoIdealFactory.getCalculator(pessoa)
        val peso = calculator.pesoIdeal(pessoa.altura.toFloat())
        return "O peso ideal é $peso kg"
    }
}