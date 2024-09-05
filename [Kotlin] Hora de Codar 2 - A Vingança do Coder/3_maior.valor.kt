fun main(){
    println("Insira um valor: ")
    val valor:  Int = readln().toInt()

    if(valor > 0){
        println("O valor é positivo!")
    } else if (valor < 0){
        println("O valor é negativo!")
    } else {
        println("O valor é ZERO!")
    }
}