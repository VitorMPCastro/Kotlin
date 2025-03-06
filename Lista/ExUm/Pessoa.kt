package Lista.ExUm

enum class GeneroBioEnum{
    MASC, FEM, NULL
}

/*
altura: CM
GeneroBio: MASC, FEM ou NULL
*/
data class Pessoa(var altura: Float, var generoBio: GeneroBioEnum) {

    constructor() : this(1.70f, GeneroBioEnum.NULL)
}