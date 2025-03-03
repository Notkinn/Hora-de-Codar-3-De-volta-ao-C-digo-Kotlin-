fun main(){
    println("Vamos descobrir seu peso ideal, escolha um gênero designado ao nascer ")
    println("1 - Homem \n2 - Mulher")
    val opcao = readln().toInt()

    when(opcao) {
        1 -> {
            print("Informe sua altura: ")
            var altura = readln().toDouble()
            var resultado = (72.7*altura)-58
            print("Seu peso ideal é $resultado")
        }
        2 -> {
            print("Informe sua altura: ")
            var altura = readln().toDouble()
            var resultado = (62.1*altura)-44.7
            print("Seu peso ideal é $resultado")
        }
        else -> {
            print("Número inválido")
        }
    }

}