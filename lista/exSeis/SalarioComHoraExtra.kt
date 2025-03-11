package lista.exSeis

class SalarioComHoraExtra : SalarioCalculator {
    private val horasNormais = 40 * 4 // 160 horas no mês
    private val taxaExtra = 1.5f

    override fun calcularSalario(horasTrabalhadas: Int, salarioPorHora: Float): Float {
        return if (horasTrabalhadas > horasNormais) {
            val horasExtras = horasTrabalhadas - horasNormais
            (horasNormais * salarioPorHora) + (horasExtras * salarioPorHora * taxaExtra)
        } else {
            horasTrabalhadas * salarioPorHora
        }
    }
}