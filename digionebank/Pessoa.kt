package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.456.789-11"
    private set
}

    fun main() {


        val jether = Pessoa()

        println(jether)
        println(jether.nome)
        println(jether.cpf)
    }
