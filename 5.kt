//5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles.
// Considere que o primeiro sempre será menor que o segundo.

fun main(){
    print("Informe o primeiro número: ")
    var num1 = readln().toInt()
    print("Informe o segundo número: ")
    var num2 = readln().toInt()

    var cont = num1
    var div = 0.0
    var soma = 0.0
    while(cont <= num2){
        soma += cont
        cont++
        div++
    }
    print("A média aritmética dos dois números informados e todos entres eles é: ${soma/div}")

}