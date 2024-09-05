fun main(){
    val num1 = 15

    var list = mutableListOf<Double>()

    for (i in num1 .. 100){
       list.add(i.toDouble())
    }
    println("A média total é: " + list.sum()/list.count())
}