fun main(){
    println("Vamos descobrir se você pode votar esse ano")
    print("Informe o ano atual: ")
    var anoatual = readln().toInt()
    print("Informe seu ano de nascimento: ")
    var anonascimento = readln().toInt()

    var voto = anoatual - anonascimento
    if (voto >= 18){
        print("Você já pode votar esse ano")
    }
    else{
        print("Você não pode votar esse ano")
    }
}