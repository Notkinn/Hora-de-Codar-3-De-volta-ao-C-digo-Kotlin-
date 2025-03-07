//4 - Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).
fun main(){
    var contador = 15.0
    var soma = 0.0
    var div = 0.0
    while (contador <= 100){
        soma += contador
        contador++
        div++
    }
    print("A média aritmética do número 15 ao 100 é igual a ${soma/div}")
}