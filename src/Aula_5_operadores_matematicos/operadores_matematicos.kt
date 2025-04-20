package Aula_5_operadores_matematicos

fun main() {

    val num = 4
    val num2 = 2
    // Operadores básicos
    println(num + num2)
    println(num - num2)
    println(num * num2)
    println(num / num2)
    println(num % num2)

    // Operadores de incremento
    var num3 = 10
    var num4 = 20

    num3++ //Adiciona 1 unidade ao valor da variável
    num4--  //Subtrai 1 unidade ao valor da variável

    println(num3)
    println(num4)


    // Atribuição composta

    var num5 = 10
    num5 += num // Equivalente à sintaxe num5 = num5 + num
    // outros operadores de atribuição composta
    // -= , *=, /= e %=
    println(num5)

    //Biblioteca math

    // Operação com Round, Floor, Ceil e Pow(exponencial e precisar adicionar 2 parâmetros: base e exponente como Double)
    // O valor da variável para as operações abaixo precisa ser um numero Double

    val value = 5.23
    val base = 2.0
    val exponent = 3.0

    // Opreração Math.round()

    val valueRound = Math.round(value)
    println(valueRound)
    // Operacão Math.floor()

    val valueFloor = Math.floor(value)
    println(valueFloor)
    // Operacão Math.ceil()

    val valueCeil = Math.ceil(value)
    println(valueCeil)

    // Operacão Math.pow()

    val valuePow = Math.pow(base,exponent)
    println(valuePow)

}