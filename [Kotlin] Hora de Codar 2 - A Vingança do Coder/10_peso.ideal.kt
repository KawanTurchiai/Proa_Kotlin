fun main(){
    //exercicio 10

    println("----> SEJAM BEM VINDOS <----\n" + "Insira seu genêro:\n" + "1 - Feminino\n" + "2 - Masculino")
    var opcao_genero: Int = readln().toInt()

    println("Insira sua Altura: ")
    var altura = readln().toDouble()

    val peso = when(opcao_genero){
        1 -> (62.1 * altura) - 44.7
        2 ->  (72.7 * altura) - 58
        else ->{
            println("Valor de genêro invalido!")
            return
        }
    }
    println("O total do seu peso é %.2f ".format(peso))

    if(opcao_genero == 1){
        println("Genêro Femino")
    }else{
        println("Genêro Masculino")
    }
}