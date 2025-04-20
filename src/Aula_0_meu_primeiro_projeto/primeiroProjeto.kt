package Aula_0_meu_primeiro_projeto

fun main() {
    println("Insira o seu nome:")
    val name = readln()

    println("Olá, $name")

    println("Qual a sua idade?")
    val age = readln().toInt() // Convertendo a string para inteiro

    for (i in 1..age) { // Usando range correto
        val idadeTexto = if (i == age) "A sua idade é $i!" else "$i..."
        println(idadeTexto)
    }


}

