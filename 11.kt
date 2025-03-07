//11 - Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.
fun main(){
    var cont = 1
    var ordem = 1
    var entre = 0
    var fora = 0
    while(cont <= 10){
        print("Escreva o $ordem° número: ")
        var numero = readln().toInt()
        ordem++
        cont++
        if(numero in 24..42){
            entre++
        }
        else{
            fora++
        }

    }
    println("A quantidade de números informados entres 24 e 42 são: $entre e fora são: $fora")
}