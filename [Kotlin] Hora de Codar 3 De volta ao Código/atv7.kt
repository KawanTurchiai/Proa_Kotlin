fun main(){
    val list = mutableListOf<Int>()

    for (cont in 1..6){
        print("Insira SEIS notas: ")
        var notas: Double = readln().toDouble()

        if (notas < 0 || notas > 10){
            println("Valor ultrapassado! Tente novamente!")
            print("Insira: ")
            notas = readln().toDouble()
            list.add(notas.toInt())
    } else if (notas <= 10 || notas >= 0){
        list.add(notas.toInt())
        } else {
            println("Deu erro minha Criança!")
        }
    }
    println("Media do aluno é "+list.sum()/list.count() + "." +  "\nAté logo minha Criança!")
}
