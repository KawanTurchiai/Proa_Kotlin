fun main(){
    var listA = mutableListOf<Int>()
    var listB = mutableListOf<Int>()

    for (cont in 1..10){
        print("Insira DEZ valores: ")
        var valores: Int = readln().toInt()

        if (valores >= 24 && valores <= 42){
            var situacaoA = valores
            listA.add(situacaoA)
        } else{
            var situacaoB = valores
            listB.add(situacaoB)
        }
    }
    println("Valores Selecionados(Entre o Intervalo): " + listA.sum() + ". Entre 24 e 42" + "\nValores da Lista: " + listA + "\n")
    println("Valores Selecionados(Fora do Intervalo): " + listB.sum() + ". Fora do do Intervalo entre 24 e 42" + "\nValores da Lista: " + listB)
}