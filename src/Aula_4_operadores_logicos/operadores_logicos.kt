package Aula_4_operadores_logicos

fun main() {
    val a = true
    val b = false
    val c = true

    //Operador E (&&) - Quando ambas as variáveis são verdadeiras
    println("Operador E")
    val result = a && b
    val result2 = a && c


    println(result)
    println(result2)

    //Operador OU (||) - Quando uma das variáveis for verdadeira
    println("Operador OU")

    val result3 = a || b
    val result4 = a || c
    val result5 = b || b

    println(result3)
    println(result4)
    println(result5)

    // Operador NÃO (!)
    println("Operador NÃO")

    val e = true
    val f = !e

    println(e)
    println(f)

//Operador de igualdade (==)
 // Operador de desigualdade (!=) - Diferente de...
 // Operador é do tipo (is) e não é do tipo(!is))

 // Operador in e !in) está e não está





}