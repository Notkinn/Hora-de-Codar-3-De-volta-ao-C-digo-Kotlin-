fun main(){
    print("Informe um valor para saber se é positivo negatico ou zero: ")
    var a = readLine()?.toDouble()


    if (a != null) {
        if (a > 0){
            println("Seu número é positivo")
        } else if( a < 0 ){
            println("Seu número é negativo")
        } else{
            println("Seu número é zero")
        }
    }

}