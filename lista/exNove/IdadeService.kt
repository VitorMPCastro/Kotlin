package lista.exNove

class IdadeService {
    fun calcularIdade(anoNascimento: Int, anoAtual: Int): Map<String, Int> {
        val idadeAnos = anoAtual - anoNascimento
        return mapOf(
            "anos" to idadeAnos,
            "meses" to idadeAnos * 12,
            "dias" to idadeAnos * 365,
            "semanas" to idadeAnos * 52
        )
    }
}