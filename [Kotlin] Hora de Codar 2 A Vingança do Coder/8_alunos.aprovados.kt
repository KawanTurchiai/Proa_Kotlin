fun main(){
    var list = mutableListOf<Double>()

    for (i in 1..4){
        println("Insira (quatro valores): ")
        list.add(readln().toDouble())
    }

    var numero1 = list.filter { it <= 10 }
    var numero2 = numero1.sum() / numero1.count()

    println(numero1)


    if(numero2 <= 5){
        println("A média é $numero1")
        println("Aluno reprovado! ")
    } else{
        println("A média é $numero2")
        println("Aluno Aprovado!")
    }
}