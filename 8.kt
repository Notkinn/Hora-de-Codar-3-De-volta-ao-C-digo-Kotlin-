fun main(){
    var contador = 1
    var numero = 0
    var soma = 0
    println("Informe quatro número de 0 a 10 para calcular a média: ")

    while (contador <= 4) {
        print("Informe o $contador° número: ")
        numero = readln().toInt()
        if (numero in 0..10){
        soma += numero
        contador++
        }
        else{
            println("Erros, informe números de 0  10")
        }
    }
    var resultado = soma/4
    if (resultado >= 5){
        print("Você passou no teste")
    }
    else{
        print("tente novamente")
    }
}

