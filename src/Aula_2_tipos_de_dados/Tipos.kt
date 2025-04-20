package Aula_2_tipos_de_dados

fun main(){
    //Tipos de dados
    // tipos numéricos
    val byte: Byte = -128 //sequencia de 8 bits
    val short: Short = 32_767 //sequencia de 16 bits
    val int: Int = 1000000000 //sequencia de 32 bits
    val long: Long = 3182983193128923

    val float: Float = 3f // é necessário colocar um "f" no final pra sinalizar que existe a separacão de ponto flutuante.
    val double: Double = 3.14 // precisa do ponto pra definir que é um numero de ponto flutuante

    //texto
    val nome: String = "Felipe"
    val char: Char = 'a' //Precisa ser declarado com aspas simples é só pode conter 1 caracter no formato unicode*
    //val string: String = "Palavra" // Podemos declarar uma string atribuindo aspas dupla para frases ou aspas triplas para textos longos
    //val string: String = """
//        TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto
//        TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto
//        TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto
//        TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto
   // """.trimIndent()
    val string: String = "$nome,$short" // forma de colocar o valor de outra variável no texto. Pode ser no formato ${} para variáveis individuais, ou somenste com o cifrão $variavel*

    //Boleano

    val true_false: Boolean = false
}