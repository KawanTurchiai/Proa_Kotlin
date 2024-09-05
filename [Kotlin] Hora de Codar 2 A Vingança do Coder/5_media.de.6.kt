fun main (){
    var list = mutableListOf<Int>()

    for (i in 1 .. 6){
        println("Insira (seis) valores: ")
        list.add(readln().toInt())
    }
    println(list)

    var media: Int
    var  media_Total: Int
    media = list.sum()
    media_Total = media / list.count()

    println("O calculo total é $media")
    println("A média aritmetica é $media_Total")
}