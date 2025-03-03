fun main(){
    var contador = 1
    var numero = 0
    var soma = 0
    var respostas = mutableListOf<Int>()
    println("Informe seis números para saber a soma entres os números inferiores a 72: ")

    while (contador <= 6) {
        print("Informe o $contador° número: ")
        numero = readln().toInt()
        respostas.add(numero)
        if (numero < 72){
            soma += numero
        }
        contador++
    }
    println("Os números informados foram: ${respostas.joinToString(", ")}")

    println("A soma dos números inferiores a 72 é: $soma")

}