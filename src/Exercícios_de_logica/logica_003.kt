package Exercícios_de_logica

fun main(){
    println("Digite dois números que eu retorno o maior entre eles!")
    println("------------------------------------------------------")
    println("Digite o primeiro número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número: ")
    val num2 = readln().toInt()

    fun maior(a: Int, b: Int){
        if(a>b){
            println("O número $a é maior que o número $b")
        }else{
            println("O número $b é maior que o número $a")
        }
    }
   maior(num1,num2)
}