fun main(){
    println("Escreva um três números para saber o maior deles ")
    print("Informe o primeiro número: ")
    var a = readln().toDouble()
    print("Informe o segundo número: ")
    var b = readln().toDouble()
    print("Informe o terceiro número: ")
    var c = readln().toDouble()

    if (a > b && a > c){
        print("O maior número é $a")
    }
    else if (b > a && b > c){
        print("O maior número é $b")
    }
    else{
        print("O maior número é $c")
    }
}