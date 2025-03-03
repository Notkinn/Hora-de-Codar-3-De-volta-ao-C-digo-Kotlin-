fun main(){
    println("Escreva dois números para saber qual o maior deles ")
    print("Informe o primeiro número: ")
    var a = readln().toDouble()
    print("Informe o segundo número: ")
    var b = readln().toDouble()

    if (a > b) {
        print("O maior número é $a")
    }
    else{
        print("O maior número é $b")
    }
}