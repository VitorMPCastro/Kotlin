package prova1.sistema_combustivel.combustiveis

import prova1.sistema_combustivel.Combustivel
import prova1.sistema_combustivel.regrasDesconto.RegraDescontoGasolina


class Gasolina : Combustivel(5.99f, RegraDescontoGasolina())