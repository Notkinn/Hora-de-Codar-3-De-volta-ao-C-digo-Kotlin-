//6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
// Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
fun main(){
    var opcao = "S"
    while(opcao == "S") {
        println("Vamos calcular a média do Aluno")
        print("Informe a primeira nota: ")
        var no1 = readln().toInt()
        print("Informe a segunda nota: ")
        var not2 = readln().toInt()

        var resul = (no1 + not2) / 2

        if (resul >= 9.5) {
            println("O aluno foi aprovado")
        } else {
            println("O aluno foi reprovado")
        }

        println("Calcular a média de outro aluno S/N?")
        opcao = readln()
    }
}