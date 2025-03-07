//8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
//N  é um valor informado pelo usuário

fun main(){
    print("Digite um numero inteiro maior que 0: ")
    var numero = readLine()!!.toInt()
    var cont = 1
    while (cont <= numero){
        println(cont)
        cont++
    }
}