val listAluno = mutableListOf<String>()

fun main(){
    println("Seja Bem Vindo Minha Criança")
    alunos()
    adicionar()
}

fun alunos(){
    print("Insira seu nome Aluno: ")
    var nome_aluno = readln()

    print("Insira a primeira nota: ")
    var nota1 = readln().toDouble()


    print("Insira a segunda nota: ")
    var nota2 = readln().toDouble()

    var media: Double
    media = (nota1 + nota2) / 2

    if(media >= 9.5){
        println("Você foi Aprovado!")
        listAluno.add(nome_aluno)
    }else{
        println("Você foi Reprovado!")
    }
}

 fun adicionar(){
     println("Calcular a média de outro aluno Sim/Não?")
     var opcao = readln().lowercase()

     while(opcao == "s"){
         alunos()
     }

     if(opcao == "n"){
         println("Valeu!")
     }

     println("Foram aprovados "+ listAluno.count() +" alunos" + "\nNome das Crianças: " + listAluno)
 }