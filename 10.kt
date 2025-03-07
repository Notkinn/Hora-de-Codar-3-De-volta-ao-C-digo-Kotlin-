//10 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.

fun main(){
    var numero = 0
    var cont = 0

    print("Digite um numero inteiro: ")
    numero = readln().toInt()
    while (cont < 10){
        cont++
        println("$cont X $numero = ${cont*numero}")
    }
}