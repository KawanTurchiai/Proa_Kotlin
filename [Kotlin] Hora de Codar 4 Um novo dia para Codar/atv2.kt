fun main(){
    //exercicio 2
    var planetas = mutableListOf<String>("Terra", "Marte", "Plutão", "Vênus","Júpiter", "Saturno")

    println("Insira o nome de um Planeta: ")
    var planeta: String = readln().toString()

    if(planetas.contains(planeta)){
        println("Planeta na lista!")

    } else{
        println("Planeta fora da Lista!" + "\nPlaneta Adicionado a Lista!")
        planetas.add(planeta)
    }
    println(planetas)
}



