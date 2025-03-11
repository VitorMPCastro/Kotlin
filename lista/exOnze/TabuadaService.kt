package lista.exOnze

class TabuadaService {
    fun gerarTabuada(numero: Int) {
        for (i in 1..10) {
            println("$numero x $i = ${numero * i}")
        }
    }
}