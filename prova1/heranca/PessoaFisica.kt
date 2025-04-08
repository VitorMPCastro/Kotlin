package prova1.heranca

class PessoaFisica(
    private var cpf : String,
    nome: String, rua: String,
    telefone: String,
    numero: Int, bairro: String,
    cidade: String,
    conta: Int,
    salario: Float
) : Pessoa(
    nome,
    rua,
    telefone,
    numero,
    bairro,
    cidade,
    conta,
    salario
) {
}