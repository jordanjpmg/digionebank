package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Jordan"

    var cpf:String = "111.333.666.20"
    private set

}

fun main() {
    val jordan = Pessoa()
    println(jordan.cpf)

    jordan.nome = "123185"



    println(jordan.nome)
    println(jordan.cpf)


}