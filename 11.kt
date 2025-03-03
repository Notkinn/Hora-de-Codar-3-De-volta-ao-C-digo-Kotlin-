fun main(){
    var resultado: Double
    println("Vamos calcular!!!")
    print("Informe o primeiro número: ")
    var a = readln().toDouble()
    print("Informe o segundo número: ")
    var b = readln().toDouble()

    println("Escolha a operação matemática que deseja realizar: ")
    println("1 - Adição\n2 - Subtração\n3 - Divisão\n4 - Multiplicação")
    var opcao = readln().toInt()

    when(opcao){
        1->{
            resultado = a + b
            print("O resultado é: $resultado")
        }
        2->{
            resultado = a-b
            print("O resultado é: $resultado")
        }
        3->{
            resultado = a/b
            print("O resultado é: $resultado")
        }
        4->{
            resultado = a*b
            print("O resultado é: $resultado")
        }
    }
}