fun main(){
    var a: Double
    var b: Double
    var c: Double
    var maior: Double
    var maior2: Double

    println("Escreva três números para descobrir a soma entres os dois maiores: ")
    print("Informe o primeiro número: ")
    a = readln().toDouble()
    print("Informe o segundo número: ")
    b = readln().toDouble()
    print("Informe o terceiro número: ")
    c = readln().toDouble()

    if (a >= b && a >= c){
        maior = a
        if (b >= c){
            maior2 = b
        }
        else{
            maior2 = c
        }
    }
    else if (b >= a && b >= c){
        maior = b
        if (a >= c){
            maior2 = a
        }
        else{
            maior2 = c
        }
    }
    else{
        maior = c
        if (a >= b){
            maior2 = a
        }
        else{
            maior2 = b
        }
    }

    var resultado = maior + maior2

    println("A soma dos maiores números informados é: $resultado")



}