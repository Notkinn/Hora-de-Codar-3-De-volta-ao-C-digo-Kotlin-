//7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário.
fun main(){
    var cont = 1
    var ordem = 1
    var soma = 0.0
    var div = 0


    println("Vamos calcular a média de um aluno")
    while(cont <= 6){
        var nota = 0.0
        print("Escreva o $cont° nota: ")
        nota = readln().toDouble()
        if (nota >= 0 && nota <= 10) {
            cont++
            soma += nota
            div++
        }
        else{
            println("Nota inválida, tente novamente.")
        }
    }
    print("A média aritmética do aluno é: ${soma/div}")
}