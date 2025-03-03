fun main(){
    var maior: Int
    println("Informe quatro valores para para saber o maior deles e o primeiro e último número informado:" )
    print("Informe o primeiro número: ")
    var a = readln().toInt()
    print("Informe o segundo número: ")
    var b = readln().toInt()
    print("Informe o terceiro número: ")
    var c = readln().toInt()
    print("Informe o quarto número: ")
    var d = readln().toInt()

    if (a > b && a > c && a > d){
        maior = a
    }
    else if(b > a && b > c && b>d){
        maior = b
    }
    else if (c > a && c > b && c > d){
        maior = c
    }
    else{
        maior = d
    }

    print("O primeiro número informado foi $a, o último foi $b e o maior de todos ele é $maior")
}