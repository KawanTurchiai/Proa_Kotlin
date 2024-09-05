fun main(){
    var list = mutableListOf<Int>()

    for (i in 1..3){
        println("Insira (três valores): ")
        list.add(readln().toInt())
    }

    var maior: Int

    if (list[0] > list[1] && list[0] > list[2]){
        maior = list[0]

    }else if (list[1] > list[0] && list[1] > list[2]){

        maior = list[1]
    }else {
        maior = list[2]
    }

    println("O maior é $maior")

    var menor: Int

    if (list[0] < list[1] && list[0] < list[2]){

        menor = list[0]
    }else if (list[1] < list[0] && list[1] < list[2]){

        menor = list[1]
    }else {

        menor = list[2]
    }

    println("O menor é $menor")


    var media: Int

    if(list[0] != maior && list[0] != menor){
        media = list[0]
    } else if (list[1] != maior && list[1] != menor){
        media = list[1]
    } else {
        media = list[2]
    }
    println("O valor do meio é $media")
    var soma: Int = media + maior
    print("A soma dos dois maiores números é $soma")
}