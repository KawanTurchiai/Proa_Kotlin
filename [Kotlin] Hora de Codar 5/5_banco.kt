var saldo = 150.0
fun main() {
    println("Qual o seu nome?")
    val nome = readln()
    println("Olá. $nome")
    login(nome)
}

fun login(nome: String) {
    println("$nome, nos informe qual a senha?")
    val senha = readln().toInt()
    if (senha == 3589) {
        opcoes();
    } else {
        println("Erro!\nTente novamente")
    }
}

fun opcoes() {
    println(
        "Selecione uma opção\n1. Saldo \n2.Extrato \n3. Saque \n4. Deposito\n5. Transferir\n6. Sair"
    )
    var opcao = readln().toInt()
    when {
        opcao == 1 -> { sal() }
        opcao == 2 -> { ext() }
        opcao == 3 -> { saq() }
        opcao == 4 -> { dep()}
        opcao == 5 -> { trans()}
        opcao == 6 -> { exit()}
    }
}

fun sal() {
    println("O seu saldo é de R$$saldo")
    opcoes()
}

fun ext() {
    println("Quanto deseja sacar?")
}
fun saq() {

    println("Quanto deseja sacar?")
    var saque = readln().toDouble()
    if (saldo >= saque) {
        saldo = saldo - saque
        println("Saque efetuado!\nSaldo = R$$saldo")
    } else {
        println("Vai trabalhar, seu pobre! faz o L")
        saq();
    }
    opcoes();
}

fun dep() {
    println("Quanto deseja depositar?")
}

fun exit() {
    println("$Nome, foi um prazer ter você por aqui!")
}
