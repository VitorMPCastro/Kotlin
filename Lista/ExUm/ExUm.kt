package Lista.ExUm

fun ExUm() {
    val Alanito = Pessoa(1.74f, GeneroBioEnum.MASC)
    val Alanita = Pessoa(1.74f, GeneroBioEnum.FEM)

    println(PesoIdeal().getPesoIdeal(Alanito))
    println(PesoIdeal().getPesoIdeal(Alanita))
}