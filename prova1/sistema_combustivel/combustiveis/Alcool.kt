package prova1.sistema_combustivel.combustiveis

import prova1.sistema_combustivel.Combustivel
import prova1.sistema_combustivel.regrasDesconto.RegraDescontoAlcool


class Alcool : Combustivel(3.39f, RegraDescontoAlcool())