fun main () {
    println("Vamos calcular a área do trapézio! \nQual a base maior? ")
    val bmaior = readln().toDouble()
    println("Qual a base menor? ")
    val bmenor = readln().toDouble()
    println("Qual a altura? ")
    val h = readln().toDouble()
    print( "A área do Trapézio é igual a ${((bmaior +bmenor)*h)/2}!")
}