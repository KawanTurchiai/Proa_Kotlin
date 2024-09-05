fun main(){
    println("\n---> Cálculadorinha1 <--- \n\n OPERADORES: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n Escolha: " )
    var opcao = readln().toInt()

    println("Insira o Primeiro valor: ")
    var valor1 = readln().toInt()

    println("Insira o Segundo valor: ")
    var valor2 = readln().toInt()

    var calculo = when(opcao){
        1 -> valor1 + valor2
        2 -> valor1 - valor2
        3 -> valor1 * valor2
        4 -> if (valor2 != 0 ) valor1 / valor2 else{
            println("Não é Possivel dividir por zero!")
        } else -> {
            println("Opçao inválida")
            return
        }
    }

    if(opcao == 1){
        println("A soma é  $valor1 + $valor2 = $calculo")
    }
    else if (opcao == 2){
        println("A subtração é  $valor1 - $valor2 =  $calculo")
    }
    else if (opcao == 3){
        println("A multiplicação é  $valor1 * $valor2 = $calculo")
    }
    else{
        println("A divisão e $valor1 / $valor2 =  $calculo")
    }
}