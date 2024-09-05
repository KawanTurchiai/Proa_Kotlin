fun main(){
    //exercicio 3
    var frutas = mutableListOf<String>("Laranja", "Maça", "Banana", "Uva", "Maracujá")
    println("SACOLÃO DO LUQUINHAS \nFrutas Disponiveis:\n$frutas\n")

    while(true){
        print("Escolha Uma das Frutas: ")
        var escolherFruta = readln().toString()

        if(frutas.contains(escolherFruta)){
            frutas.remove(escolherFruta)
            println("Fruta foi retirada da lista.")
            println("Lista de compras: $frutas")
        }else {
            println("Fruta indisponível no nosso mercado.")
        }

        println("Deseja Continuar? ")
        var opcao: String = readln().toString()
        if(opcao  == "n") {
           print("\"Lista de compras finalizada!\n")
            break
        }
    }
    println("Lista de Compras: \n" +  frutas)
}
