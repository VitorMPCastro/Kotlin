package lista.exTres.combustiveis

import lista.exTres.Combustivel
import lista.exTres.regrasDesconto.RegraDescontoAlcool

class Alcool : Combustivel(3.39f, RegraDescontoAlcool())