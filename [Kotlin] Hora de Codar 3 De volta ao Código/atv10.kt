fun main() {
    val n = 10 //

    for (cont in 1..n) {
        println("Tabuada do $cont:")
        for (tabuada in 1..10) {
            println("$cont x $tabuada = ${cont * tabuada}")
        }
        println("")
    }
}