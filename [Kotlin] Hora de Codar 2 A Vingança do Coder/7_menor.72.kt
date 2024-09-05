fun main(){
    var list = mutableListOf<Int>()

    for (i in 1..6){
        println("Insira (seis) valores: ")
        list.add(readln().toInt())
    }

    var soma_total: Int
    val menor72: Int = 72

    soma_total = list.filter { it < menor72 }.sum()
    println("A soma total é $soma_total")
}
