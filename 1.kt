import kotlin.contracts.Returns

//1 - Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou menor que ZERO, deve ser lido um novo valor. Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.
//
//O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.

fun main(){
    println("Vamos dividir!!!")
    print("Digite o primeiro valor: ")
    var primeirovalor = readln().toDouble()
    print("Digite o segundo valor: ")
    var segundovalor = readln().toDouble()
    while (segundovalor <= 0) {
        print("Número inválido, digite novamente: ")
        segundovalor = readln().toDouble()
    }

    print("A divisão de $primeirovalor por $segundovalor é igual a ${primeirovalor/segundovalor}")
}