package lista.exDoze

class PesquisaService {
    fun calcularEstatisticas(salarios: List<Float>, filhos: List<Int>): Map<String, Float> {
        val mediaSalario = salarios.average().toFloat()
        val mediaFilhos = filhos.average().toFloat()
        val maiorSalario = salarios.maxOrNull() ?: 0f

        return mapOf(
            "mediaSalario" to mediaSalario,
            "mediaFilhos" to mediaFilhos,
            "maiorSalario" to maiorSalario
        )
    }
}