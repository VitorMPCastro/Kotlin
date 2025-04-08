package prova1.heranca

class PessoaJuridica(
    private var cnpj : String,
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