fun main(){
    //Exercicio 1
    var estudantes = 0

    while(true){
        print("Digite o nome do estudante para o cadastro: ")
        var nome: String = readln()
        estudantes += 1

        print("Deseja continuar? S/PARE")
        var contin: String = readln().toString().uppercase()

        if(contin == "S"){
            print("Digite o nome do estudante para o cadastro: ")
            nome = readln().toString()
            estudantes += 1

        } else if (contin == "PARE"){
            println("Foram $estudantes estudantes cadastrados")
            break
        }
    }
}