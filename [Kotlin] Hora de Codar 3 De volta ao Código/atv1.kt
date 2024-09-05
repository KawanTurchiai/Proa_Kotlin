fun main(){
    //Exercicio1

    print("Insira o primeiro valor: ")
    var num1 = readln().toInt()

    println("Insira o segundo valor:")
    var num2 = readln().toInt()

    while (num2 <= 0){
       println("Insira o segundo valor novamente: ")
        num2 = readln().toInt()
    }

    if(num2 > 1 ){
        var result: Int
        result = num1 / num2
        println("O total da divisão é: $result ")
    }
}