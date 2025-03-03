fun main(){

    var soma: Double = 0.0
    var contador = 1

    var ordem = 1

    println("Vamos calcular a média aritmetica de seis números: ")


    while(contador > 0 && contador <= 6){
        print("Informe o $ordem° número: ")
        soma += readln().toDouble()
        contador += 1
        ordem += 1
    }
    var resultado = soma/2
    print("A média aritmética dos números informados é: $resultado")
}