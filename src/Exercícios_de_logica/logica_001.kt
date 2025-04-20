package Exercícios_de_logica

fun main(){
    // Exercício I
    // Crie um algoritmo que receba 2 números e imprima a soma deles na tela
    println("Digite dois números para realizar uma soma")
    println("------------------------------------------")
    println("Digite o primeiro número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número: ")
    val num2 = readln().toInt()

    val result = num1 + num2
    println("A soma de $num1 e $num2 é $result")

    // Exercício II
    // Crie uma função que receba dois números como entrada e retorne a sua soma.

    fun soma(a: Int, b: Int){
        val resp = a + b
        return println("A soma de $a e $b é $resp")
    }
   soma(num1, num2)
}