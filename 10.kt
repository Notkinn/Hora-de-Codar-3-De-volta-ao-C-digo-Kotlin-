//10 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.
fun main(){
    var numero: Int]
    var cont = 1

    print("Digite um numero inteiro: ")
    numero = readln().toInt()

  while (cont <= numero){
    var numero3 = 1
      while (numero3 <= 10){
          println("$cont X $numero3 = ${cont*numero3}")
          numero3++
          }
      println("______________________________")
      cont++
      }
  }
