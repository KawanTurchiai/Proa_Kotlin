fun main(){
    println("\n---> URNA ELETRÔNICA < --- \n")

    println("Você possuí Titulo Eleitoral: (SIM/NÃO)")
    var titulo_eleitoral: String = readln().toString()

    if(titulo_eleitoral == "s"){
        println("Você Possui titulo eleitoral\n")
    }
    else {
        println("Você não tem titulo eleitoral. Não pode votar!\n")
        return
    }

    println("Insira seu Ano de Nascimento: ")
    var ano_nascimento = readln().toInt()
    val anoAtual = 2024
    var calcIdade = anoAtual - ano_nascimento

    if(calcIdade >= 16){
        println("Pode votar, pois sua idade é $calcIdade")
    }
    else{
        println("Não pode votar!")
    }
}