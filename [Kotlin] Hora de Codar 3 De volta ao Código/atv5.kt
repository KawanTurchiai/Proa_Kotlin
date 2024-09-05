fun main(){
    var list = mutableListOf<Int>()
    print("Insira um Primeiro Valor: ")
    var valor1: Int = readln().toInt()

    print("Insira um Segundo valor: ")
    var valor2: Int = readln().toInt()

    while(valor1 >= valor2){
        print("Digite um valor que seja menor que o segundo numero informado: ")
        valor1 = readln().toInt()
    }

    for (cont in valor1..valor2){
      list.add(cont)
    }
    println("A média total é: " + list.sum() / list.count())
}