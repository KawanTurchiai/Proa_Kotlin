fun main(){
    //Exercicio2

    for(b in 30 downTo 1){
        Thread.sleep(1000)
        println("Restam $b segundos")
    }
    println("Boom!!!")
}