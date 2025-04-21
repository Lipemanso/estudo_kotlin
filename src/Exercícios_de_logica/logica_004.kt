package Exercícios_de_logica

fun main(){
    println("Descubra se um número é par ou ímpar")
    println("------------------------------------")
    println("Digite o numero e descubra: ")
    val num = readln().toInt()

    if(num % 2 == 0){
     println("O número $num é par!")
    }else{
        println("O número $num é ímpar")
    }
}