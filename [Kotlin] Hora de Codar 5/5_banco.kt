var saldo = 150.0
fun main() {
    println("Qual o seu nome? ")
    var nome = readln().toString()
    println("Olá. $nome")
    login(nome)
}
fun login(nome: String) {

    if (vali(nome)) {
        opcoes(nome)
    } else {
        error()
        login(nome)
    }
}
fun vali(nome: String): Boolean {
    println("$nome, nos informe qual a senha?")
    val senha = readln().toInt()
    return senha == 3589
}
fun opcoes(nome: String) {
    println(
        "Selecione uma opção\n1. Saldo \n2 .Extrato \n3. Saque \n4. Deposito\n5. Transferir\n6. Sair"
    )
    var opcao = readln().toInt()
    when {
        opcao == 1 -> if (vali(nome)){sal(nome)} else  error()
        opcao == 2 -> if (vali(nome)){ext(nome)} else  error()
        opcao == 3 -> if (vali(nome)){saq(nome)} else  error()
        opcao == 4 -> if (vali(nome)){dep(nome)} else  error()
        opcao == 5 -> if (vali(nome)){transfer(nome)} else  error()
        opcao == 6 -> if (vali(nome)){exit(nome)} else  error()
    }
}
fun sal(nome: String) {
    println("O seu saldo é de R$$saldo")
    opcoes(nome)
}
fun ext(nome: String) {
    print("Extrato referente ao mês de Setembro")
    println("- 87,00 Outback")
    println("- 47,00 Renner")
    println("- 91,00 Pizzaria Pizzaboa")
    println("+ 1.412,00 Salário")
    opcoes(nome)
}
fun saq(nome: String) {
    println("Quanto deseja sacar?")
    var saque = readln().toDouble()
    if (saldo < saque || saque <= 0) {
        println("Operação não autorizada")
        saq(nome);

    } else {
        saldo -= saque
        println("Saque efetuado!\nSaldo = R$$saldo")
    }
    opcoes(nome);
}
fun dep(nome: String) {

    println("Quanto deseja depositar?")
    var deposito = readln().toDouble()
    saldo += deposito
    println("Deposito efetuado!\nSaldo = R$$saldo")
    opcoes(nome);
}
fun transfer(nome: String) {
    println("Para quem deseja tranferir?")
    var pessoa = readln()
    println("Quanto deseja tranferir?")
    var value = readln().toDouble()
    saldo -= value
    println("A tranferencia de R$$value foi enviado para $pessoa, Saldo = R\$$saldo")
    opcoes(nome)
}
fun exit(nome: String) {
    println("$nome, foi um prazer ter você por aqui!")
}
fun error (){
    println("ERRO!")
}